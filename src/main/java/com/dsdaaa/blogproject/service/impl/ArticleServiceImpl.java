package com.dsdaaa.blogproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.blogproject.domain.Article;
import com.dsdaaa.blogproject.mapper.ArticleMapper;
import com.dsdaaa.blogproject.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author DunSton
 * @description 针对表【article】的数据库操作Service实现
 * @createDate 2023-10-07 18:08:33
 */
@Service
@Transactional(readOnly = true)
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
        implements ArticleService {
    @Resource
    ArticleMapper articleMapper;

    /**
     * 根据条件获取文章列表
     *
     * @param article
     * @return
     */
    @Override
    public List<Article> getArticleList(Article article) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("cid", article.getCid());
        List<Article> list = articleMapper.selectList(queryWrapper);
        return list;
    }
}




