package com.liu.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.pojo.CoursePojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseDao extends BaseMapper<CoursePojo> {
}
