package com.dsdaaa.blogproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.blogproject.domain.User;
import com.dsdaaa.blogproject.mapper.UserMapper;
import com.dsdaaa.blogproject.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author DunSton
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2023-10-07 18:08:40
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Resource
    UserMapper userMapper;

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username", user.getUsername());
        queryWrapper.eq("password", user.getPassword());
        User loginUser = userMapper.selectOne(queryWrapper);
        if (loginUser != null) {
            return loginUser;
        }
        return null;
    }
}




