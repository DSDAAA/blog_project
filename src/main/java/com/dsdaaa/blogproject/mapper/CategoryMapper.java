package com.dsdaaa.blogproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.blogproject.domain.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DunSton
 * @description 针对表【category】的数据库操作Mapper
 * @createDate 2023-10-07 18:08:37
 * @Entity generator.domain.Category
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




