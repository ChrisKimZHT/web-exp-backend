package com.zouht.todolist.service.user;

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
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email", email);

        User user = userMapper.selectOne(queryWrapper);

        if (user == null) {
            throw new RuntimeException("UserNotFound");
        }
        return new UserDetailImpl(user);
    }
}

