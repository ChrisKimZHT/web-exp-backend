package com.zouht.todolist.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @TableId(type = IdType.AUTO)
    private Integer todoId;
    private Integer userId;
    private String title;
    private String detail;
    private Integer begin;
    private Integer end;
    private Boolean isDeadLine;
    private Boolean isFinished;
}
