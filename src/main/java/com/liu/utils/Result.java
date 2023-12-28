package com.liu.utils;


import com.alibaba.fastjson2.JSONObject;
import java.util.HashMap;
import java.util.Map;


public class Result {
    public static String okGet(String msg){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("msg",msg);
        String s = JSONObject.toJSONString(map);
        return s;
    }
    public static String okGetByData(String msg,Object data){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("msg",msg);
        map.put("data",data);
        String s = JSONObject.toJSONString(map);
        return s;
    }
}
