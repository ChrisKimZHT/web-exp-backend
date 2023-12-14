package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.NoteCreateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class NoteCreateController {
    @Resource
    NoteCreateService noteCreateService;

    @PostMapping("/note/create")
    public Map<String, Object> create(@RequestBody Map<String, Object> map) {
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        Integer id = (Integer) data.get("id");
        String title = (String) data.get("title");
        String content = (String) data.get("content");
        Integer date = (Integer) data.get("date");
        Boolean isStared = (Boolean) data.get("isStared");
        return noteCreateService.create(id, title, content, date, isStared);
    }
}
