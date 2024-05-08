package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class TodoToggleFinishService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> toggleFinish(Integer todoId) {
        Todo todo = todoMapper.selectById(todoId);
        todo.setIsFinished(!todo.getIsFinished());
        todoMapper.updateById(todo);
        return Map.of("status", 0, "message", "OK");
    }
}
