package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoToggleFinishService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class TodoToggleFinishController {
    @Resource
    TodoToggleFinishService todoToggleFinishService;

    @GetMapping("/todo/toggleFinish")
    public Map<String, Object> toggleFinish(@RequestParam Integer todoId, HttpServletResponse response) {
        if (todoId == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "id is null");
        }

        try {
            return todoToggleFinishService.toggleFinish(todoId);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
