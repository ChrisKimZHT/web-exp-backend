package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class TodoDeleteService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> delete(Integer todoId) {
        todoMapper.deleteById(todoId);
        return Map.of("status", 0, "message", "OK");
    }
}
