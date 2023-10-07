package com.dsdaaa.blog_project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.blog_project.domain.Article;
import com.dsdaaa.blog_project.service.ArticleService;
import com.dsdaaa.blog_project.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author 13180
* @description 针对表【article】的数据库操作Service实现
* @createDate 2023-10-07 18:08:33
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




