package com.zouht.todolist.controller.user;

import com.zouht.todolist.service.user.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class RegisterController {
    @Resource
    private RegisterService registerService;

    @PostMapping("/user/register")
    public Map<String, Object> register(@RequestBody Map<String, Object> map, HttpServletResponse response) {
        String email = (String) map.get("email");
        String password = (String) map.get("password");
        String avatar = (String) map.get("avatar");

        if (email == null || password == null) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "email and password are required");
        }

        try {
            return registerService.register(email, password, avatar);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
