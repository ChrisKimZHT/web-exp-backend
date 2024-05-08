package com.zouht.todolist.service.user;

import com.zouht.todolist.mapper.UserMapper;
import com.zouht.todolist.pojo.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserUpdateService {
    @Resource
    private PasswordEncoder passwordEncoder;

    @Resource
    UserMapper userMapper;

    public Map<String, Object> update(String email, String password, String avatarFileName) {
        // TODO: 没判平行越权
        String encodedPassword = passwordEncoder.encode(password);

        User user = new User(null, email, encodedPassword, avatarFileName);
        userMapper.updateById(user);

        return Map.of("status", 0, "message", "OK");
    }
}
