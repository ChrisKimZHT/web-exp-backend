package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.NoteCreateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class NoteCreateController {
    @Resource
    NoteCreateService noteCreateService;

    @PostMapping("/note/create")
    public Map<String, Object> create(@RequestBody Map<String, Object> map, HttpServletResponse response) {
        String title = (String) map.get("title");
        String content = (String) map.get("content");

        if (title == null || content == null) {
            response.setStatus(400);
            return Map.of("error", "Bad Request");
        }

        try {
            return noteCreateService.create(title, content);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
