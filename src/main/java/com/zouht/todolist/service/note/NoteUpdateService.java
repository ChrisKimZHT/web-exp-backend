package com.zouht.todolist.service.note;

import java.util.Map;

public interface NoteUpdateService {
    Map<String, Object> update(Integer id, String title, String content, Integer date, Boolean isStared);
}
