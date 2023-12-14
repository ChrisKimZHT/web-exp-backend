package com.zouht.todolist.service.todo;

import java.util.Map;

public interface TodoUpdateService {
    Map<String, Object> update(Integer id, String title, String detail, Integer begin, Integer end, Boolean isDeadLine, Boolean isFinished);

}
