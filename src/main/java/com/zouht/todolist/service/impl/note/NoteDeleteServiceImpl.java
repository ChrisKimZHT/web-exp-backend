package com.zouht.todolist.service.impl.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.service.note.NoteDeleteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class NoteDeleteServiceImpl implements NoteDeleteService {
    @Resource
    NoteMapper noteMapper;

    @Override
    public Map<String, Object> delete(Integer id) {
        noteMapper.deleteById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
