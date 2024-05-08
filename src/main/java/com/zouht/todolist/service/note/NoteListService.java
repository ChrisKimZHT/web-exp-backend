package com.zouht.todolist.service.note;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zouht.todolist.mapper.NoteMapper;
import com.zouht.todolist.pojo.Note;
import com.zouht.todolist.service.user.UserDetailImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class NoteListService {
    @Resource
    NoteMapper noteMapper;

    public Map<String, Object> list() {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailImpl loginUSer = (UserDetailImpl) authenticationToken.getPrincipal();
        Integer user = loginUSer.getUser().getUserId();

        QueryWrapper<Note> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", user);
        List<Note> noteList = noteMapper.selectList(queryWrapper);

        return Map.of("status", 0, "message", "OK", "data", noteList);
    }
}
