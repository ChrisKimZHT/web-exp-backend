package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.ListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class ListController {
    @Resource
    ListService listService;

    @GetMapping("/note/list")
    public Map<String, Object> list() {
        return listService.list();
    }


}
