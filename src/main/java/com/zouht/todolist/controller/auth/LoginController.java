package com.zouht.todolist.controller.auth;

import com.zouht.todolist.service.auth.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class LoginController {
    @Resource
    private LoginService loginService;

    @PostMapping("/auth/login")
    public Map<String, Object> login(@RequestBody Map<String, Object> map) {
        String username = (String) map.get("username");
        String password = (String) map.get("password");
        return loginService.login(username, password);
    }
}
