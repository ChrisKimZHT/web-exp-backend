package com.zouht.todolist.service.userDetail;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zouht.todolist.mapper.UserMapper;
import com.zouht.todolist.pojo.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            throw new RuntimeException("UserNotFound");
        }
        return new UserDetailImpl(user);
    }
}

