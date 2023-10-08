package com.dsdaaa.blogproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dsdaaa.blogproject.domain.Category;
import com.dsdaaa.blogproject.service.CategoryService;
import com.dsdaaa.blogproject.utils.Result;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 类别控制层
 */
@RestController
@RequestMapping("/category")
@Tag(name = "body参数")
@Slf4j
public class CategoryController {
    @Resource
    CategoryService categoryService;

    /**
     * 分页查询
     *
     * @param pageNum
     * @param pageSize
     * @param category
     * @return
     */
    @PostMapping("/findPage/{pageNum}/{pageSize}")
    public Result<Page> findPage(@PathVariable Integer pageNum,
                                 @PathVariable Integer pageSize,
                                 @RequestBody Category category) {
        Page page = categoryService.findPage(pageNum, pageSize, category);
        return Result.ok(page);
    }
}
