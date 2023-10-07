package com.dsdaaa.blog_project.mapper;

import com.dsdaaa.blog_project.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13180
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-10-07 18:08:40
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




