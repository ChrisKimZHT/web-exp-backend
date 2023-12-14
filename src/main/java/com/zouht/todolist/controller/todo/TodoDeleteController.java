package com.zouht.todolist.controller.todo;

import com.zouht.todolist.service.todo.TodoDeleteService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TodoDeleteController {
    @Resource
    private TodoDeleteService todoDeleteService;

    @DeleteMapping("/todo/delete")
    public Map<String, Object> delete(@RequestBody Map<String, Object> map) {
        Integer id = (Integer) map.get("id");
        return todoDeleteService.delete(id);
    }


}
