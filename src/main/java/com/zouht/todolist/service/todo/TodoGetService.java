package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class TodoGetService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> get(Integer todoId) {
        // TODO: 没判平行越权
        Todo todo = todoMapper.selectById(todoId);
        return Map.of("status", 0, "message", "OK", "data", todo);
    }
}
