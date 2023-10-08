package com.dsdaaa.blogproject.controller;

import com.dsdaaa.blogproject.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 */
@RestController
@RequestMapping("/user")
@Tag(name = "body参数")
public class UserController {
    @Resource
    UserService userService;
}
