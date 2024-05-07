package com.zouht.todolist.service.todo;

import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import com.zouht.todolist.pojo.User;
import com.zouht.todolist.service.userDetail.UserDetailImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class TodoCreateService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> create(Integer id, String title, String detail, Integer begin, Integer end, Boolean isDeadLine, Boolean isFinished) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailImpl loginUSer = (UserDetailImpl) authenticationToken.getPrincipal();
        User user = loginUSer.getUser();
        Todo todo = new Todo(null, user.getId(), title, detail, begin, end, isDeadLine, isFinished);
        todoMapper.insert(todo);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        return map;
    }
}
