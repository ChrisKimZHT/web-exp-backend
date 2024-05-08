package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class TodoUpdateService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> update(Integer todoId, String title, String detail, Integer begin, Integer end, Boolean isFinished) {
        Todo todo = todoMapper.selectById(todoId);
        todo.setTitle(title);
        todo.setDetail(detail);
        todo.setBegin(begin);
        todo.setEnd(end);
        todo.setIsFinished(isFinished);
        todoMapper.updateById(todo);
        return Map.of("status", 0, "message", "OK");
    }
}
