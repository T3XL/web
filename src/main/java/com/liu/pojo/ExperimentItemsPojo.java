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
@TableName(value = "experimentitems")
public class ExperimentItemsPojo {
    @TableId(value = "itemno",type= IdType.NONE)
    private String itemno;
    @TableField(value = "itemname")
    private String itemname;
    @TableField(value = "courseno")
    private String courseno;
    @TableField(value = "itemhour")
    private int itemhour;
    @TableField(value = "itemcontent")
    private String itemcontent;
    @TableField(value = "itemtype")
    private int itemtype;
    @TableField(value = "iscompulsory")
    private int iscompulsory;
}
