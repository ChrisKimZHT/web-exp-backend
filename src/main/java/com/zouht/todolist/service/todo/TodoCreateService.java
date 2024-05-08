package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import com.zouht.todolist.pojo.User;
import com.zouht.todolist.service.user.UserDetailImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class TodoCreateService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> create(String title, String detail, Integer begin, Integer end, Boolean isDeadLine, Boolean isFinished) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailImpl loginUSer = (UserDetailImpl) authenticationToken.getPrincipal();
        User user = loginUSer.getUser();

        Todo todo = new Todo(null, user.getUserId(), title, detail, begin, end, isDeadLine, isFinished);
        todoMapper.insert(todo);

        return Map.of("status", 0, "message", "OK");
    }
}
