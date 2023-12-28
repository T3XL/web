package com.liu.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liu.dao.CourseDao;
import com.liu.pojo.CoursePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;
    public void addCourse(String courseno,String coursename,int credit,int credithour,int coursetype,int experimenttype,String description){
        courseDao.insert(new CoursePojo(courseno,coursename,credit,credithour,coursetype,experimenttype,description));
    }
    public void deleteCourse(String courseno){
        courseDao.deleteById(courseno);
    }
    public void deleteCourseByCoursename(String coursename){
        courseDao.delete(new QueryWrapper<CoursePojo>().like("coursename",coursename));
    }
    public void updateCourse(String courseno,String coursename,int credit,int credithour,int coursetype,int experimenttype,String description){
        courseDao.updateById(new CoursePojo(courseno,coursename,credit,credithour,coursetype,experimenttype,description));
    }
    public Object getCourse(String courseno){
        return courseDao.selectList(new QueryWrapper<CoursePojo>().like("courseno",courseno));
    }
    public Object getCourseByCoursename(String coursename){
        return courseDao.selectList(new QueryWrapper<CoursePojo>().like("coursename",coursename));
    }



}
