package com.zouht.todolist.service.impl.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import com.zouht.todolist.pojo.User;
import com.zouht.todolist.service.impl.util.UserDetailImpl;
import com.zouht.todolist.service.note.NoteCreateService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class NoteCreateServiceImpl implements NoteCreateService {
    @Resource
    private NoteMapper noteMapper;

    @Override
    public Map<String, Object> create(Integer id, String title, String content, Integer date, Boolean isStared) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailImpl loginUser = (UserDetailImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();
        Note note = new Note(null, user.getId(), title, content, date, isStared);
        noteMapper.insert(note);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
