package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoDeleteService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class TodoDeleteController {
    @Resource
    private TodoDeleteService todoDeleteService;

    @DeleteMapping("/todo/delete")
    public Map<String, Object> delete(@RequestParam Integer todoId, HttpServletResponse response) {
        if (todoId == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "todoId is null");
        }

        try {
            return todoDeleteService.delete(todoId);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
