package com.dsdaaa.blogproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.blogproject.domain.Article;
import com.dsdaaa.blogproject.mapper.ArticleMapper;
import com.dsdaaa.blogproject.service.ArticleService;
import org.springframework.stereotype.Service;

/**
* @author DunSton
* @description 针对表【article】的数据库操作Service实现
* @createDate 2023-10-07 18:08:33
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




