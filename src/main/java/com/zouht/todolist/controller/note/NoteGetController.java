package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.NoteGetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class NoteGetController {
    @Resource
    NoteGetService noteGetService;

    @GetMapping("/note/get")
    public Map<String, Object> get(@RequestParam Integer id) {
        return noteGetService.get(id);
    }


}
