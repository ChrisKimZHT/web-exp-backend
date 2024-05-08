package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoGetTodayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class TodoGetTodayController {
    @Resource
    private TodoGetTodayService todoGetTodayService;

    @GetMapping("/todo/getToday")
    public Map<String, Object> getToday(@RequestParam Integer year, @RequestParam Integer month, @RequestParam Integer day, HttpServletResponse response) {
        if (year == null || month == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "year, month are required");
        }

        try {
            return todoGetTodayService.getToday(year, month, day);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
