package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.NoteUpdateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class NoteUpdateController {
    @Resource
    NoteUpdateService noteUpdateService;

    @PostMapping("/note/update")
    public Map<String, Object> update(@RequestBody Map<String, Object> map, HttpServletResponse response) {
        Integer noteId = (Integer) map.get("noteId");
        String title = (String) map.get("title");
        String content = (String) map.get("content");
        Integer date = (Integer) map.get("date");
        Boolean isStared = (Boolean) map.get("isStared");

        if (noteId == null || title == null || content == null || date == null || isStared == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "Invalid parameters");
        }

        try {
            return noteUpdateService.update(noteId, title, content, date, isStared);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }

}
