package com.dsdaaa.blogproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.blogproject.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DunSton
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2023-10-07 18:08:40
 * @Entity generator.domain.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




