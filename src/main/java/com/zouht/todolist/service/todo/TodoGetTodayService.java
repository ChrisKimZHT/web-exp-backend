package com.zouht.todolist.service.todo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zouht.todolist.mapper.TodoMapper;
import com.zouht.todolist.pojo.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class TodoGetTodayService {
    @Resource
    TodoMapper todoMapper;

    public Map<String, Object> getToday(Integer year, Integer month, Integer day) {
        LocalDate dateLowerBound, dateUpperBound;
        if (day != null) {
            dateLowerBound = LocalDate.of(year, month, day);
            dateUpperBound = dateLowerBound.plusDays(1);
        } else {
            dateLowerBound = LocalDate.of(year, month, 1);
            dateUpperBound = dateLowerBound.plusMonths(1);
        }
        Integer timestampLowerBound = (int) dateLowerBound.toEpochDay() * 24 * 60 * 60;
        Integer timestampUpperBound = (int) dateUpperBound.toEpochDay() * 24 * 60 * 60;
        QueryWrapper<Todo> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("begin", timestampLowerBound, timestampUpperBound);
        queryWrapper.or();
        queryWrapper.between("end", timestampLowerBound, timestampUpperBound);
        List<Todo> todoList = todoMapper.selectList(queryWrapper);
        return Map.of("status", 0, "message", "OK", "data", todoList);
    }
}
