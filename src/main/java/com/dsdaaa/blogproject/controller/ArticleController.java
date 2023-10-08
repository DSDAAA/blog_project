package com.dsdaaa.blogproject.controller;

import com.dsdaaa.blogproject.domain.Article;
import com.dsdaaa.blogproject.service.ArticleService;
import com.dsdaaa.blogproject.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author DunSton
 * 文章控制层
 */
@RestController
@RequestMapping("/article")
@Tag(name = "文章接口")
@Slf4j
public class ArticleController {
    @Resource
    ArticleService articleService;

    /**
     * 根据条件获取文章列表
     *
     * @param article
     * @return
     */
    @PostMapping("articleList")
    @Operation(summary = "获取文章列表")
    @Parameters(value = {@Parameter(name = "文章", required = false)})
    public Result<List<Article>> getArticleList(@RequestBody(required = false) Article article) {
        log.info("接收参数:" + article.toString());
        List<Article> articleList = articleService.getArticleList(article);
        return Result.ok(articleList);
    }

    /**
     * 根据id查询文章
     *
     * @param id
     * @return
     */
    @GetMapping("/getById/{id}")
    @Operation(summary = "根据id获取文章")
    @Parameters(value = {@Parameter(name = "文章id", required = false)})
    public Result<Article> getArticle(@PathVariable Long id) {
        log.info("接收参数:" + id);
        Article articleById = articleService.getArticleById(id);
        return Result.ok(articleById);
    }

    /**
     * 根据id删除文章
     *
     * @param id
     * @return
     */
    @DeleteMapping("/deleteById/{id}")
    @Operation(summary = "根据id删除文章")
    @Parameters(value = {@Parameter(name = "文章id", required = false)})
    public Result<Boolean> deleteArtcle(@PathVariable Long id) {
        log.info("接收参数:" + id);
        Boolean deleted = articleService.deleteById(id);
        return Result.ok(deleted);
    }

    /**
     * 增加文章
     *
     * @param article
     * @return
     */
    @PostMapping("insertArticle")
    @Operation(summary = "增加单个文章")
    @Parameters(value = {@Parameter(name = "文章", required = false)})
    public Result insertArticle(@RequestBody(required = false) Article article) {
        log.info("接收参数:" + article.toString());
        Boolean inserted = articleService.insertArticle(article);
        if (inserted) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @PutMapping("update")
    @Operation(summary = "更新文章")
    @Parameters(value = {@Parameter(name = "文章", required = false)})
    public Result updateArticle(@RequestBody(required = false) Article article) {
        log.info("接收参数:" + article.toString());
        Integer update = articleService.update(article);
        return Result.ok(update);
    }
}
