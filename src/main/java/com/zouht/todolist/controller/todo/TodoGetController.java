package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoGetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class TodoGetController {
    @Resource
    private TodoGetService todoGetService;

    @GetMapping("/todo/get")
    public Map<String, Object> get(@RequestParam Integer todoId, HttpServletResponse response) {
        if (todoId == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "todoId is null");
        }

        try {
            return todoGetService.get(todoId);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
