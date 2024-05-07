package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoDeleteService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> delete(Integer id) {
        todoMapper.deleteById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
