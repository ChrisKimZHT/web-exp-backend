package com.zouht.todolist.service.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class NoteGetService {
    @Resource
    NoteMapper noteMapper;

    public Map<String, Object> get(Integer noteId) {
        Note note = noteMapper.selectById(noteId);
        return Map.of("status", 0, "message", "OK", "data", note);
    }
}
