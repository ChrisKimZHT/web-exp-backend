package com.zouht.todolist.service.user;

import com.zouht.todolist.pojo.User;
import com.zouht.todolist.util.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class LoginService {
    @Resource
    private AuthenticationManager authenticationManager;

    public Map<String, Object> login(String username, String password) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        UserDetailImpl loginUser = (UserDetailImpl) authenticate.getPrincipal();

        User user = loginUser.getUser();
        String jwt = JwtUtil.createJWT(user.getUserId().toString());

        return Map.of("status", 0, "message", "OK", "token", jwt, "userId", user.getUserId(), "avatar", user.getAvatarFileName());
    }
}
