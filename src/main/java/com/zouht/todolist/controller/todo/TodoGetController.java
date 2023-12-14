package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.note.NoteGetService;
import com.zouht.todolist.service.todo.TodoGetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TodoGetController {
    @Resource
    private TodoGetService todoGetService;

    @GetMapping("/todo/get")
    public Map<String, Object> get(@RequestParam Integer id) {
        return todoGetService.get(id);
    }
}
