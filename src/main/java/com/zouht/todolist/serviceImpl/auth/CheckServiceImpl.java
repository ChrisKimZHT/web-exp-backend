package com.zouht.todolist.serviceImpl.auth;

import com.zouht.todolist.pojo.User;
import com.zouht.todolist.service.auth.CheckService;
import com.zouht.todolist.serviceImpl.util.UserDetailImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CheckServiceImpl implements CheckService {
    @Override
    public Map<String, Object> check() {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailImpl loginUser = (UserDetailImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        map.put("uid", user.getId());
        return map;
    }
}
