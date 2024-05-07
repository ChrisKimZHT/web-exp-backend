package com.zouht.todolist.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    @TableId(type = IdType.AUTO)
    private Integer noteId;
    private Integer userId;
    private String title;
    private String content;
    private Integer date;
    private Boolean isStared;
}
