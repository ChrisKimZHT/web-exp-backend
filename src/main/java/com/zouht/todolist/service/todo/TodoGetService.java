package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoGetService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> get(Integer id) {
        Todo todo = todoMapper.selectById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        map.put("data", todo);
        return map;
    }
}
