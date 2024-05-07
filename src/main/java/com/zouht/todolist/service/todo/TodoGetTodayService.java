package com.zouht.todolist.service.todo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TodoGetTodayService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> getToday(Integer year, Integer month, Integer day) {
        LocalDate dateLowerBound = LocalDate.of(year, month, day);
        LocalDate dateUpperBound = dateLowerBound.plusDays(1);
        Integer timestampLowerBound = (int) dateLowerBound.toEpochDay() * 24 * 60 * 60;
        Integer timestampUpperBound = (int) dateUpperBound.toEpochDay() * 24 * 60 * 60;
        QueryWrapper<Todo> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("begin", timestampLowerBound, timestampUpperBound);
        queryWrapper.or();
        queryWrapper.between("end", timestampLowerBound, timestampUpperBound);
        List<Todo> todoList = todoMapper.selectList(queryWrapper);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        map.put("message", "OK");
        map.put("data", todoList);
        return map;
    }
}
