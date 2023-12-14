package com.zouht.todolist.service.impl.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import com.zouht.todolist.service.note.ListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ListServiceImpl implements ListService {
    @Resource
    NoteMapper noteMapper;

    @Override
    public Map<String, Object> list() {
        List<Note> noteList = noteMapper.selectList(null);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        map.put("data", noteList);
        return map;
    }
}
