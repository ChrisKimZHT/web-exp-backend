package com.zouht.todolist.service.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import com.zouht.todolist.pojo.User;
import com.zouht.todolist.service.user.UserDetailImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class NoteCreateService {
    @Resource
    private NoteMapper noteMapper;

    public Map<String, Object> create(Integer id, String title, String content, Integer date, Boolean isStared) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailImpl loginUser = (UserDetailImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();
        Note note = new Note(null, user.getUserId(), title, content, date, isStared);
        noteMapper.insert(note);
        return Map.of("status", 0, "message", "OK");
    }
}
