package com.dsdaaa.blogproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsdaaa.blogproject.domain.Article;

import java.util.List;

/**
 * @author DunSton
 * @description 针对表【article】的数据库操作Service
 * @createDate 2023-10-07 18:08:33
 */
public interface ArticleService extends IService<Article> {
    /**
     * 根据条件获取文章列表
     *
     * @param article
     * @return
     */
    List<Article> getArticleList(Article article);

    /**
     * 增加文章
     *
     * @param article
     * @return
     */

    Boolean insertArticle(Article article);
}
