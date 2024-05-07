package com.zouht.todolist.controller.user;

import com.zouht.todolist.service.user.CheckService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class CheckController {
    @Resource
    CheckService checkService;

    @PostMapping("/user/check")
    public Map<String, Object> check() {
        return checkService.check();
    }
}
