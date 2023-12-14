package com.zouht.todolist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zouht.todolist.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
