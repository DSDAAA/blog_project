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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * 增加文章
     *
     * @param article
     * @return
     */
    @PostMapping("insertArticle")
    @Operation(summary = "增加单个文章")
    @Parameters(value = {@Parameter(name = "文章", required = false)})
    public Result<List<Article>> insertArticle(@RequestBody(required = false) Article article) {
        log.info("接收参数:" + article.toString());
        Boolean inserted = articleService.insertArticle(article);
        if (inserted) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
}
