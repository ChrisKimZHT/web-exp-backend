package com.zouht.todolist.serviceImpl.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import com.zouht.todolist.service.todo.TodoToggleFinishService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoToggleFinishServiceImpl implements TodoToggleFinishService {
    @Resource
    TodoMapper todoMapper;

    @Override
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
