package com.zouht.todolist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zouht.todolist.pojo.Todo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper extends BaseMapper<Todo> {
}
