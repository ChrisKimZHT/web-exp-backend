package com.zouht.todolist.service.impl.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import com.zouht.todolist.service.todo.TodoGetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoGetServiceImpl implements TodoGetService {
    @Resource
    TodoMapper todoMapper;

    @Override
    public Map<String, Object> get(Integer id) {
        Todo todo = todoMapper.selectById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        map.put("data", todo);
        return map;
    }
}
