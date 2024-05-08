package com.zouht.todolist.service.note;

import com.zouht.todolist.mapper.NoteMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class NoteDeleteService {
    @Resource
    NoteMapper noteMapper;

    public Map<String, Object> delete(Integer noteId) {
        // TODO: 没判平行越权
        noteMapper.deleteById(noteId);
        return Map.of("status", 0, "message", "OK");
    }
}
