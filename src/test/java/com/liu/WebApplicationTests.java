package com.liu;

import com.liu.pojo.CoursePojo;
import com.liu.service.CourseService;
import com.liu.service.ExperimentItemsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WebApplicationTests {
    @Autowired
    ExperimentItemsService experimentItemsService;
    @Test
    void contextLoads() {
        experimentItemsService.addExperimentItems("210731104000","数据挖掘", "210731104001", 1, "wajue", 1, 1);
    }
//    @Test
//    void test(){
//        courseService.deleteCourseByCoursename("数");
//    }
//    @Test
//    void test2(){
//        courseService.updateCourse("202111070914","数据挖掘",1,1,1,1,"wajue");
//    }
//    @Test
//    void test3(){
//        CoursePojo coursePojos = courseService.getCourse("210731104001");
//        System.out.println(coursePojos);
//    }

}
