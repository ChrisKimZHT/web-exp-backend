package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoUpdateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class TodoUpdateController {
    @Resource
    TodoUpdateService todoUpdateService;

    @PostMapping("/todo/update")
    public Map<String, Object> update(@RequestBody Map<String, Object> map, HttpServletResponse response) {
        Integer todoId = (Integer) map.get("todoId");
        String title = (String) map.get("title");
        String detail = (String) map.get("detail");
        Integer begin = (Integer) map.get("begin");
        Integer end = (Integer) map.get("end");
        Boolean isFinished = (Boolean) map.get("isFinished");

        if (todoId == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "todoId is null");
        }

        try {
            return todoUpdateService.update(todoId, title, detail, begin, end, isFinished);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
