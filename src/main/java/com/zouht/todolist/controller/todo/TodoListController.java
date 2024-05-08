package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class TodoListController {
    @Resource
    TodoListService todoListService;

    @GetMapping("/todo/list")
    public Map<String, Object> list(HttpServletResponse response) {
        try {
            return todoListService.list();
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
