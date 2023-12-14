package com.zouht.todolist.service.impl.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.service.todo.TodoDeleteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoDeleteServiceImpl implements TodoDeleteService {
    @Resource
    TodoMapper todoMapper;

    @Override
    public Map<String, Object> delete(Integer id) {
        todoMapper.deleteById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
