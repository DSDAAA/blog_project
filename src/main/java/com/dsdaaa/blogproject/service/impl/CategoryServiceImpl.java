package com.dsdaaa.blogproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.blogproject.domain.Category;
import com.dsdaaa.blogproject.mapper.CategoryMapper;
import com.dsdaaa.blogproject.service.CategoryService;
import org.springframework.stereotype.Service;

/**
* @author DunSton
* @description 针对表【category】的数据库操作Service实现
* @createDate 2023-10-07 18:08:37
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService {

}




