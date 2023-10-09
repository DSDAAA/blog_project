package com.dsdaaa.blogproject.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dsdaaa.blogproject.domain.Article;
import com.dsdaaa.blogproject.domain.Category;
import com.dsdaaa.blogproject.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author DunSton
 * @description 针对表【category】的数据库操作Service
 * @createDate 2023-10-07 18:08:37
 */
public interface CategoryService extends IService<Category> {
    Page findPage(Integer pageNum, Integer pageSize, Category category);

    /**
     * 获取类别列表
     *
     * @param category
     * @return
     */
    List<Category> getCategoryList(Category category);
    /**
     * 增加类别
     *
     * @param category
     * @return
     */

    Boolean insertCategory(Category category);

    /**
     * 根据id查询类别
     *
     * @param cid
     * @return
     */
    Category getCategoryById(Long cid);

    /**
     * 更新类别
     *
     * @param category
     * @return
     */
    Integer update(Category category);

    /**
     * 删除类别
     *
     * @param id
     * @return
     */
    Boolean deleteById(Long id);
}
