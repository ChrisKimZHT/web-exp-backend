package com.zouht.todolist.serviceImpl.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import com.zouht.todolist.service.note.NoteGetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class NoteGetServiceImpl implements NoteGetService {
    @Resource
    NoteMapper noteMapper;

    @Override
    public Map<String, Object> get(Integer id) {
        Note note = noteMapper.selectById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        map.put("data", note);
        return map;
    }
}
