package com.zouht.todolist.service.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class NoteUpdateService {
    @Resource
    NoteMapper noteMapper;

    public Map<String, Object> update(Integer id, String title, String content, Integer date, Boolean isStared) {
        Note note = noteMapper.selectById(id);
        note.setTitle(title);
        note.setContent(content);
        note.setDate(date);
        note.setIsStared(isStared);
        noteMapper.updateById(note);
        return Map.of("status", 0, "message", "OK");
    }
}
