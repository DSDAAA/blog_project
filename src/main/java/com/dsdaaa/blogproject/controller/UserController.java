package com.dsdaaa.blogproject.controller;

import com.dsdaaa.blogproject.domain.User;
import com.dsdaaa.blogproject.service.UserService;
import com.dsdaaa.blogproject.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制层
 */
@RestController
@RequestMapping("/user")
@Tag(name = "用户接口")
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
    @Operation(summary = "用户登录")
    @Parameters(value = {@Parameter(name = "用户", required = false)})
    public Result login(@RequestBody User user) {
        User loginUser = userService.login(user);
        if (loginUser != null) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
}
