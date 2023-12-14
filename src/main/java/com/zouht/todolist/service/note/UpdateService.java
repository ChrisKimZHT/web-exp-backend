package com.zouht.todolist.service.note;

import java.util.Map;

public interface UpdateService {
    Map<String, Object> update(Integer id, String title, String content, Integer date, Boolean isStared);
}
