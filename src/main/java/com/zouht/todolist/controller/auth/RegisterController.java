package com.zouht.todolist.controller.auth;

import com.zouht.todolist.service.auth.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class RegisterController {
    @Resource
    private RegisterService registerService;

    @PostMapping("/auth/register")
    public Map<String, Object> register(@RequestBody Map<String, Object> map) {
        String username = (String) map.get("username");
        String password = (String) map.get("password");
        return registerService.register(username, password);
    }
}
