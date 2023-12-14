package com.zouht.todolist.service.auth;

import java.util.Map;

public interface LoginService {
    Map<String, Object> login(String username, String password);
}
