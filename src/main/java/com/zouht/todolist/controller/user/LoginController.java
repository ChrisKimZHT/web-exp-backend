package com.zouht.todolist.controller.user;

import com.zouht.todolist.service.user.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class LoginController {
    @Resource
    private LoginService loginService;

    @PostMapping("/user/login")
    public Map<String, Object> login(@RequestBody Map<String, Object> map) {
        String email = (String) map.get("email");
        String password = (String) map.get("password");
        return loginService.login(email, password);
    }
}
