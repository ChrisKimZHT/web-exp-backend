package com.zouht.todolist.service.impl.note;

import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import com.zouht.todolist.service.note.NoteToggleStarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class NoteToggleStarServiceImpl implements NoteToggleStarService {
    @Resource
    NoteMapper noteMapper;

    @Override
    public Map<String, Object> toggleStar(Integer id) {
        Note note = noteMapper.selectById(id);
        note.setIsStared(!note.getIsStared());
        noteMapper.updateById(note);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
