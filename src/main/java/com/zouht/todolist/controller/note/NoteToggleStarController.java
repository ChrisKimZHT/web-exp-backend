package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.NoteToggleStarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class NoteToggleStarController {
    @Resource
    NoteToggleStarService noteToggleStarService;

    @GetMapping("/note/toggleStar")
    public Map<String, Object> toggleStar(@RequestParam Integer id) {
        return noteToggleStarService.toggleStar(id);
    }

}
