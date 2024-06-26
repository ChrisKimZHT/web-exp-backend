package com.zouht.todolist.controller.user;

import com.zouht.todolist.service.user.CheckService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class CheckController {
    @Resource
    CheckService checkService;

    @PostMapping("/user/check")
    public Map<String, Object> check(HttpServletResponse response) {
        try {
            return checkService.check();
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
