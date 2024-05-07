package com.zouht.todolist.service.auth;

import com.zouht.todolist.mapper.UserMapper;
import com.zouht.todolist.pojo.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class RegisterService {
    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    UserMapper userMapper;

    public Map<String, Object> register(String username, String password) {
        String encodedPassword = passwordEncoder.encode(password);
        User user = new User(null, username, encodedPassword);
        userMapper.insert(user);

        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        map.put("uid", user.getId());
        return map;
    }
}
