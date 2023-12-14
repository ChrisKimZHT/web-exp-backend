package com.zouht.todolist.controller.note;

import com.zouht.todolist.service.note.DeleteService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class DeleteController {
    @Resource
    DeleteService deleteService;

    @DeleteMapping("/note/delete")
    public Map<String, Object> delete(@RequestBody Map<String, Object> map) {
        Integer id = (Integer) map.get("id");
        return deleteService.delete(id);
    }

}
