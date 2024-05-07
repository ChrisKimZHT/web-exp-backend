package com.zouht.todolist.controller.user;

import com.zouht.todolist.service.user.UploadAvatarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class UploadAvatarController {
    @Resource
    UploadAvatarService uploadAvatarService;

    @PostMapping("/user/uploadAvatar")
    public Map<String, Object> uploadAvatar(@RequestParam("avatar") MultipartFile avatar, HttpServletResponse response) {
        if (avatar.isEmpty()) {
            response.setStatus(400);
            return Map.of("status", 1, "message", "avatar is empty");
        }

        try {
            return uploadAvatarService.uploadAvatar(avatar);
        } catch (Exception e) {
            response.setStatus(500);
            return Map.of("status", 1, "message", e.getMessage());
        }
    }
}
