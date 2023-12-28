package com.liu.controller;

import com.liu.pojo.ExperimentItemsPojo;
import com.liu.service.ExperimentItemsService;
import com.liu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class ExperimentItemsController {
    @Autowired
    ExperimentItemsService experimentItemsService;

    @RequestMapping(value="/addexperiment",method = RequestMethod.POST)
    public String addExperimentItems(@RequestParam("itemno") String itemno,
                                    @RequestParam("itemname") String itemname,
                                    @RequestParam("courseno") String courseno,
                                    @RequestParam("itemhour") int itemhour,
                                    @RequestParam("itemcontent") String itemcontent,
                                    @RequestParam("itemtype") int itemtype,
                                    @RequestParam("iscompulsory") int iscompulsory){
        experimentItemsService.addExperimentItems(itemno,itemname,courseno,itemhour,itemcontent,itemtype,iscompulsory);
        return Result.okGet("添加成功");
    }
    @RequestMapping(value="/deleteexperiment",method = RequestMethod.DELETE)
    public String deleteExperimentItems(@RequestParam("itemno") String itemno){
        experimentItemsService.deleteExperimentItems(itemno);
        return Result.okGet("删除成功");
    }
    @RequestMapping(value="/deleteexperimentbyname",method = RequestMethod.DELETE)
    public String deleteExperimentItemsByItemname(@RequestParam("itemname") String itemname){
        experimentItemsService.deleteExperimentItemsByItemname(itemname);
        return Result.okGet("删除成功");
    }
    @RequestMapping(value="/updateexperiment",method = RequestMethod.PUT)
    public String updateExperimentItems(@RequestParam("itemno") String itemno,
                                    @RequestParam("itemname") String itemname,
                                    @RequestParam("courseno") String courseno,
                                    @RequestParam("itemhour") int itemhour,
                                    @RequestParam("itemcontent") String itemcontent,
                                    @RequestParam("itemtype") int itemtype,
                                    @RequestParam("iscompulsory") int iscompulsory){
        experimentItemsService.updateExperimentItems(itemno,itemname,courseno,itemhour,itemcontent,itemtype,iscompulsory);
        return Result.okGet("修改成功");
    }
    @RequestMapping(value="/getexperiment/{itemno}")
    public String getExperimentItems(@PathVariable("itemno") String itemno){
        Object experimentItemsPojo = experimentItemsService.getExperimentItems(itemno);
        return Result.okGetByData("获取成功",experimentItemsPojo);
    }
    @RequestMapping(value="/getexperimentbyname/{itemname}")
    public String getExperimentItemsByItemname(@PathVariable("itemname") String itemname){
        Object experimentItemsPojo = experimentItemsService.getExperimentItemsByItemname(itemname);
        return Result.okGetByData("获取成功",experimentItemsPojo);
    }
    @RequestMapping(value="/getexperimentbycourseno/{courseno}")
    public String getExperimentItemsByCourseno(@PathVariable("courseno") String courseno){
        Object experimentItemsPojo = experimentItemsService.getExperimentItemsByCourseno(courseno);
        return Result.okGetByData("获取成功",experimentItemsPojo);
    }
}
