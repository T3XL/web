package com.liu.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liu.dao.ExperimentItemsDao;
import com.liu.pojo.ExperimentItemsPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperimentItemsService {
    @Autowired
    ExperimentItemsDao experimentItemsDao;
    public void addExperimentItems(String itemno,String itemname,String courseno,int itemhour,String itemcontent,int itemtype,int iscompulsory){
        experimentItemsDao.insert(new ExperimentItemsPojo(itemno,itemname,courseno,itemhour,itemcontent,itemtype,iscompulsory));
    }
    public void deleteExperimentItems(String itemno){
        experimentItemsDao.deleteById(itemno);
    }
    public void deleteExperimentItemsByItemname(String itemname){
        experimentItemsDao.delete(new QueryWrapper<ExperimentItemsPojo>().like("itemname",itemname));
    }
    public void deleteExperimentItemsByCourseno(String courseno){
        experimentItemsDao.delete(new QueryWrapper<ExperimentItemsPojo>().eq("courseno",courseno));
    }
    public void updateExperimentItems(String itemno,String itemname,String courseno,int itemhour,String itemcontent,int itemtype,int iscompulsory){
        experimentItemsDao.updateById(new ExperimentItemsPojo(itemno,itemname,courseno,itemhour,itemcontent,itemtype,iscompulsory));
    }
    public Object getExperimentItems(String itemno){

        return experimentItemsDao.selectList(new QueryWrapper<ExperimentItemsPojo>().like("itemno",itemno));
    }
    public Object getExperimentItemsByItemname(String itemname){
        return experimentItemsDao.selectList(new QueryWrapper<ExperimentItemsPojo>().like("itemname",itemname));
    }
    public Object getExperimentItemsByCourseno(String courseno){
        return experimentItemsDao.selectList(new QueryWrapper<ExperimentItemsPojo>().eq("courseno",courseno));
    }
}
