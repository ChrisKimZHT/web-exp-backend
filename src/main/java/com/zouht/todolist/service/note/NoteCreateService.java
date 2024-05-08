package com.zouht.todolist.service.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
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

    public Map<String, Object> create(String title, String content) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailImpl loginUser = (UserDetailImpl) authenticationToken.getPrincipal();
        Integer userId = loginUser.getUser().getUserId();
        Integer date = (int) (System.currentTimeMillis() / 1000);
        Note note = new Note(null, userId, title, content, date, false);
        noteMapper.insert(note);
        return Map.of("status", 0, "message", "OK", "noteId", note.getNoteId());
    }
}
