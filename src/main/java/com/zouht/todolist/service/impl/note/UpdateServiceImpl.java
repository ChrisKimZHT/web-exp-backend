package com.zouht.todolist.service.impl.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import com.zouht.todolist.service.note.UpdateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UpdateServiceImpl implements UpdateService {
    @Resource
    NoteMapper noteMapper;

    @Override
    public Map<String, Object> update(Integer id, String title, String content, Integer date, Boolean isStared) {
        Note note = noteMapper.selectById(id);
        note.setTitle(title);
        note.setContent(content);
        note.setDate(date);
        note.setIsStared(isStared);
        noteMapper.updateById(note);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
