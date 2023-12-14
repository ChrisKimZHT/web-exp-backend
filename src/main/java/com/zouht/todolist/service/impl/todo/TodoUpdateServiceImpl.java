package com.zouht.todolist.service.impl.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import com.zouht.todolist.service.todo.TodoUpdateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoUpdateServiceImpl implements TodoUpdateService {
    @Resource
    TodoMapper todoMapper;

    @Override
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
