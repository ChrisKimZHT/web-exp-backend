package com.zouht.todolist.serviceImpl.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import com.zouht.todolist.service.todo.TodoListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TodoListServiceImpl implements TodoListService {
    @Resource
    TodoMapper todoMapper;

    @Override
    public Map<String, Object> list() {
        List<Todo> todoList = todoMapper.selectList(null);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        map.put("data", todoList);
        return map;
    }
}
