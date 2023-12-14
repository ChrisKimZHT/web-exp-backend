package com.zouht.todolist.service.todo;

import java.util.Map;

public interface TodoCreateService {
    Map<String, Object> create(Integer id, String title, String detail, Integer begin, Integer end, Boolean isDeadLine, Boolean isFinished);


}
