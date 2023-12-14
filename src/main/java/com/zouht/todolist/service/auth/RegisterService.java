package com.zouht.todolist.service.auth;

import java.util.Map;

public interface RegisterService {
    Map<String, Object> register(String username, String password);
}
