package com.liu.controller;


import com.liu.service.CourseService;
import com.liu.service.ExperimentItemsService;
import com.liu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class CourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    ExperimentItemsService experimentItemsService;
    @RequestMapping(value="/addcourse",method = RequestMethod.POST)
    public String addCourse(@RequestParam("courseno") String courseno,
                            @RequestParam("coursename") String coursename,
                            @RequestParam("credit") int credit,
                            @RequestParam("credithour") int credithour,
                            @RequestParam("coursetype") int coursetype,
                            @RequestParam("experimenttype") int experimenttype,
                            @RequestParam("description") String description){
        courseService.addCourse(courseno,coursename,credit,credithour,coursetype,experimenttype,description);
        return Result.okGet("添加成功");
    }
    @RequestMapping(value="/deletecourse",method = RequestMethod.DELETE)
    public String deleteCourse(@RequestParam("courseno") String courseno){
        courseService.deleteCourse(courseno);
        experimentItemsService.deleteExperimentItemsByCourseno(courseno);
        return Result.okGet("删除成功");
    }
    @RequestMapping(value="/deletecoursebyname",method = RequestMethod.DELETE)
    public String deleteCourseByCoursename(@RequestParam("coursename") String coursename){
        courseService.deleteCourseByCoursename(coursename);
        return Result.okGet("删除成功");
    }
    @RequestMapping(value="/updatecourse",method = RequestMethod.PUT)
    public String updateCourse(@RequestParam("courseno") String courseno,
                            @RequestParam("coursename") String coursename,
                            @RequestParam("credit") int credit,
                            @RequestParam("credithour") int credithour,
                            @RequestParam("coursetype") int coursetype,
                            @RequestParam("experimenttype") int experimenttype,
                            @RequestParam("description") String description){
        courseService.updateCourse(courseno,coursename,credit,credithour,coursetype,experimenttype,description);
        return Result.okGet("更新成功");
    }
    @RequestMapping(value="/getcoursebyname/{coursename}")
    public String getCourseByName(@PathVariable("coursename") String coursename){
        Object list = courseService.getCourseByCoursename(coursename);
        return Result.okGetByData("查询成功",list);
    }
    @RequestMapping(value="/getcourse/{courseno}")
    public String getCourse(@PathVariable("courseno") String courseno){
        Object list = courseService.getCourse(courseno);
        return Result.okGetByData("查询成功",list);
    }
}
