package com.dsdaaa.blogproject.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dsdaaa.blogproject.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author DunSton
 * @description 针对表【category】的数据库操作Service
 * @createDate 2023-10-07 18:08:37
 */
public interface CategoryService extends IService<Category> {
    Page findPage(Integer pageNum, Integer pageSize, Category category);
}
