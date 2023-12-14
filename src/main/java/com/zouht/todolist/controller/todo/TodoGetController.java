package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.note.GetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TodoGetController {
    @Resource
    private GetService getService;

    @GetMapping("/todo/get")
    public Map<String, Object> get(@RequestParam Integer id) {
        return getService.get(id);
    }
}