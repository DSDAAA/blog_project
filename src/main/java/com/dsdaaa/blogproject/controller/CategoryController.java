package com.dsdaaa.blogproject.controller;

import com.dsdaaa.blogproject.service.CategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类别控制层
 */
@RestController
@RequestMapping("/category")
@Tag(name = "body参数")
public class CategoryController {
    @Resource
    CategoryService categoryService;
}
