package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoCreateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class TodoCreateController {
    @Resource
    private TodoCreateService todoCreateService;

    @PostMapping("/todo/create")
    public Map<String, Object> create(@RequestBody Map<String, Object> map, HttpServletResponse response) {
        String title = (String) map.get("title");
        String detail = (String) map.get("detail");
        Integer begin = (Integer) map.get("begin");
        Integer end = (Integer) map.get("end");
        Boolean isFinished = (Boolean) map.get("isFinished");

        try {
            return todoCreateService.create(title, detail, begin, end, isFinished);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
