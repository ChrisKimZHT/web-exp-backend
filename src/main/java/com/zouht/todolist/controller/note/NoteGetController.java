package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.NoteGetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class NoteGetController {
    @Resource
    NoteGetService noteGetService;

    @GetMapping("/note/get")
    public Map<String, Object> get(@RequestParam Integer noteId, HttpServletResponse response) {
        if (noteId == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "noteId is null");
        }

        try {
            return noteGetService.get(noteId);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
