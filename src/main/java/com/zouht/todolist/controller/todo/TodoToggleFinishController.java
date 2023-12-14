package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoToggleFinishService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TodoToggleFinishController {
    @Resource
    TodoToggleFinishService todoToggleFinishService;

    @GetMapping("/todo/toggleFinish")
    public Map<String, Object> toggleFinish(@RequestParam Integer id) {
        return todoToggleFinishService.toggleFinish(id);
    }


}
