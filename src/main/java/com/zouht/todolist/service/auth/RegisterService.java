package com.zouht.todolist.service.auth;

import com.zouht.todolist.mapper.UserMapper;
import com.zouht.todolist.pojo.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class RegisterService {
    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    UserMapper userMapper;

    public Map<String, Object> register(String email, String password, String avatarFileName) {
        String encodedPassword = passwordEncoder.encode(password);

        User user = new User(null, email, encodedPassword, avatarFileName);
        userMapper.insert(user);

        return Map.of("status", 0, "message", "OK", "userId", user.getUserId());
    }
}
