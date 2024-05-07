package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoToggleFinishService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> toggleFinish(Integer id) {
        Todo todo = todoMapper.selectById(id);
        todo.setIsFinished(!todo.getIsFinished());
        todoMapper.updateById(todo);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
