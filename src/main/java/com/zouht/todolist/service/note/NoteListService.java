package com.zouht.todolist.service.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class NoteListService {
    @Resource
    NoteMapper noteMapper;

    public Map<String, Object> list() {
        List<Note> noteList = noteMapper.selectList(null);
        return Map.of("status", 0, "message", "OK", "data", noteList);
    }
}
