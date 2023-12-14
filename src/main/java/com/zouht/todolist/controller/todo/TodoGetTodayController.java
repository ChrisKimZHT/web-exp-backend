package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoGetTodayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TodoGetTodayController {
    @Resource
    private TodoGetTodayService todoGetTodayService;

    @GetMapping("/todo/getToday")
    public Map<String, Object> getToday(@RequestParam Integer year, @RequestParam Integer month, @RequestParam Integer day) {
        return todoGetTodayService.getToday(year, month, day);
    }
}
