package com.zouht.todolist.service.user;

import com.zouht.todolist.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Service
public class UploadAvatarService {
    public Map<String, Object> uploadAvatar(MultipartFile avatar) throws IOException {
        String originalFilename = avatar.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileName = UUID.randomUUID() + suffix;

        String savePath = "upload/" + fileName;
        File dest = new File(savePath);
        avatar.transferTo(dest);

        return Map.of("status", 0, "message", "OK", "avatar", fileName);
    }
}
