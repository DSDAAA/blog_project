package com.dsdaaa.blog_project.mapper;

import com.dsdaaa.blog_project.domain.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13180
* @description 针对表【article】的数据库操作Mapper
* @createDate 2023-10-07 18:08:33
* @Entity generator.domain.Article
*/
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}




