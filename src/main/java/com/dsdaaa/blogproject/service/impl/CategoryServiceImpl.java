package com.dsdaaa.blogproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.blogproject.domain.Category;
import com.dsdaaa.blogproject.mapper.CategoryMapper;
import com.dsdaaa.blogproject.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author DunSton
 * @description 针对表【category】的数据库操作Service实现
 * @createDate 2023-10-07 18:08:37
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
        implements CategoryService {
    @Resource
    CategoryMapper categoryMapper;

    /**
     * 分页查询类型
     *
     * @param pageNum
     * @param pageSize
     * @param category
     * @return
     */
    @Override
    public Page findPage(Integer pageNum, Integer pageSize, Category category) {
        Page page = new Page(pageNum, pageSize);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.isNotNull("create_time");
        categoryMapper.selectPage(page, queryWrapper);
        return page;
    }

    /**
     * 增加类别
     *
     * @param category
     * @return
     */
    @Override
    public Boolean insertCategory(Category category) {
        int insert = categoryMapper.insert(category);
        if (insert != 0) {
            return true;
        }
        return false;
    }

    /**
     * 根据id获取类别
     *
     * @param cid
     * @return
     */
    @Override
    public Category getCategoryById(Long cid) {
        Category category = categoryMapper.selectById(cid);
        return category;
    }

    /**
     * 更新类别
     *
     * @param category
     * @return
     */
    @Override
    public Integer update(Category category) {
        int i = categoryMapper.updateById(category);
        return i;
    }

    /**
     * 根据id删除类别
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteById(Long id) {
        int i = categoryMapper.deleteById(id);
        if (i != 0) {
            return true;
        }
        return false;
    }
}




