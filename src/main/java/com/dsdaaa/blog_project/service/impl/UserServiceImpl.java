package com.dsdaaa.blog_project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.blog_project.domain.User;
import com.dsdaaa.blog_project.mapper.UserMapper;
import com.dsdaaa.blog_project.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 13180
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-10-07 18:08:40
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




