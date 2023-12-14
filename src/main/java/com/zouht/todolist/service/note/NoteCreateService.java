package com.zouht.todolist.service.note;

import java.util.Map;

public interface NoteCreateService {
    Map<String, Object> create(Integer id, String title, String content, Integer date, Boolean isStared);
}
