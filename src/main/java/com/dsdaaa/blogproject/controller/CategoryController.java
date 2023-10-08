package com.dsdaaa.blogproject.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dsdaaa.blogproject.domain.Category;
import com.dsdaaa.blogproject.domain.Category;
import com.dsdaaa.blogproject.service.CategoryService;
import com.dsdaaa.blogproject.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
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
@Tag(name = "类型接口")
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
    @Operation(summary = "分页查询")
    @Parameters(value = {@Parameter(name = "页数", required = false),
            @Parameter(name = "总数", required = false),
            @Parameter(name = "类型", required = false)})
    public Result<Page> findPage(@PathVariable Integer pageNum,
                                 @PathVariable Integer pageSize,
                                 @RequestBody Category category) {
        Page<Category> page = categoryService.findPage(pageNum, pageSize, category);
        return Result.ok(page);
    }

    /**
     * 根据id查询类别
     *
     * @param id
     * @return
     */
    @GetMapping("/getById/{id}")
    @Operation(summary = "根据id获取类别")
    @Parameters(value = {@Parameter(name = "类别id", required = false)})
    public Result<Category> getCategory(@PathVariable Long id) {
        log.info("接收参数:" + id);
        Category articleById = categoryService.getCategoryById(id);
        return Result.ok(articleById);
    }

    /**
     * 根据id删除类别
     *
     * @param id
     * @return
     */
    @DeleteMapping("/deleteById/{id}")
    @Operation(summary = "根据id删除类别")
    @Parameters(value = {@Parameter(name = "类别id", required = false)})
    public Result<Boolean> deleteArtcle(@PathVariable Long id) {
        log.info("接收参数:" + id);
        Boolean deleted = categoryService.deleteById(id);
        return Result.ok(deleted);
    }

    /**
     * 增加类别
     *
     * @param article
     * @return
     */
    @PostMapping("insertCategory")
    @Operation(summary = "增加单个类别")
    @Parameters(value = {@Parameter(name = "类别", required = false)})
    public Result insertCategory(@RequestBody(required = false) Category article) {
        log.info("接收参数:" + article.toString());
        Boolean inserted = categoryService.insertCategory(article);
        if (inserted) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @PutMapping("update")
    @Operation(summary = "更新类别")
    @Parameters(value = {@Parameter(name = "类别", required = false)})
    public Result updateCategory(@RequestBody(required = false) Category article) {
        log.info("接收参数:" + article.toString());
        Integer update = categoryService.update(article);
        return Result.ok(update);
    }
}
