package com.zouht.todolist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zouht.todolist.pojo.Note;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoteMapper extends BaseMapper<Note> {
}
