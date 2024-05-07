package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TodoListService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> list() {
        List<Todo> todoList = todoMapper.selectList(null);
        return Map.of("status", 0, "message", "OK", "data", todoList);
    }
}
