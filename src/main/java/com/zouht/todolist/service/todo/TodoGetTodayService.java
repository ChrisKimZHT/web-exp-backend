package com.zouht.todolist.service.todo;

import java.util.Map;

public interface TodoGetTodayService {
    Map<String, Object> getToday(Integer year, Integer month, Integer day);
}
