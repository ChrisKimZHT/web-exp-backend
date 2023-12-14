package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoCreateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TodoCreateController {
    @Resource
    private TodoCreateService todoCreateService;

    @PostMapping("/todo/create")
    public Map<String, Object> create(@RequestBody Map<String, Object> map) {
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        Integer id = (Integer) data.get("id");
        String title = (String) data.get("title");
        String detail = (String) data.get("detail");
        Integer begin = (Integer) data.get("begin");
        Integer end = (Integer) data.get("end");
        Boolean isDeadline = (Boolean) data.get("isDeadLine");
        Boolean isFinished = (Boolean) data.get("isFinished");
        return todoCreateService.create(id, title, detail, begin, end, isDeadline, isFinished);
    }


}
