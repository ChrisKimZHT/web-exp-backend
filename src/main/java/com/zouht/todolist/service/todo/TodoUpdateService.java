package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoUpdateService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> update(Integer id, String title, String detail, Integer begin, Integer end, Boolean isDeadLine, Boolean isFinished) {
        Todo todo = todoMapper.selectById(id);
        todo.setTitle(title);
        todo.setDetail(detail);
        todo.setBegin(begin);
        todo.setEnd(end);
        todo.setIsDeadLine(isDeadLine);
        todo.setIsFinished(isFinished);
        todoMapper.updateById(todo);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
