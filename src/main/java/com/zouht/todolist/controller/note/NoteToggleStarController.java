package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.NoteToggleStarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class NoteToggleStarController {
    @Resource
    NoteToggleStarService noteToggleStarService;

    @GetMapping("/note/toggleStar")
    public Map<String, Object> toggleStar(@RequestParam Integer noteId, HttpServletResponse response) {
        if (noteId == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "noteId is null");
        }

        try {
            return noteToggleStarService.toggleStar(noteId);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
