package com.dsdaaa.blogproject.controller;

import com.dsdaaa.blogproject.domain.User;
import com.dsdaaa.blogproject.service.UserService;
import com.dsdaaa.blogproject.utils.Result;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 */
@RestController
@RequestMapping("/user")
@Tag(name = "body参数")
@Slf4j
public class UserController {
    @Resource
    UserService userService;

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @PostMapping("login")
    public Result login(@RequestBody User user) {
        User loginUser = userService.login(user);
        if (loginUser != null) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
}
