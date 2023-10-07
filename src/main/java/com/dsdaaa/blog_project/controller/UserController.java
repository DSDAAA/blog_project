package com.dsdaaa.blog_project.controller;

import com.dsdaaa.blog_project.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "body参数")
public class UserController {
    @Resource
    UserService userService;
}
