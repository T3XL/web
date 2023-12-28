package com.liu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "courses")
public class CoursePojo {
    @TableId(value = "courseno",type= IdType.NONE)
    private String courseno;
    @TableField(value = "coursename")
    private String coursename;
    @TableField(value = "credit")
    private int credit;
    @TableField(value = "credithour")
    private int credithour;
    @TableField(value = "coursetype")
    private int coursetype;
    @TableField(value = "experimenttype")
    private int experimenttype;
    @TableField(value = "description")
    private String description;
}
