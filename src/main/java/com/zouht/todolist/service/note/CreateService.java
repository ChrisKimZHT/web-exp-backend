package com.zouht.todolist.service.note;

import java.util.Map;

public interface CreateService {
    Map<String, Object> create(Integer id, String title, String content, Integer date, Boolean isStared);
}
