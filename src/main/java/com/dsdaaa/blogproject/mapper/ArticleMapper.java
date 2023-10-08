package com.dsdaaa.blogproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.blogproject.domain.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DunSton
 * @description 针对表【article】的数据库操作Mapper
 * @createDate 2023-10-07 18:08:33
 * @Entity generator.domain.Article
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}




