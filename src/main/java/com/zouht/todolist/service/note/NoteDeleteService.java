package com.zouht.todolist.service.note;

import com.zouht.todolist.mapper.NoteMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class NoteDeleteService {
    @Resource
    NoteMapper noteMapper;

    public Map<String, Object> delete(Integer id) {
        noteMapper.deleteById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
