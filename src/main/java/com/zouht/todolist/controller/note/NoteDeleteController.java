package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.NoteDeleteService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class NoteDeleteController {
    @Resource
    NoteDeleteService noteDeleteService;

    @DeleteMapping("/note/delete")
    public Map<String, Object> delete(@RequestParam Integer id) {
        if (id == null) {
            return Map.of("status", 1, "message", "id is null");
        }

        try {
            return noteDeleteService.delete(id);
        } catch (Exception e) {
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
