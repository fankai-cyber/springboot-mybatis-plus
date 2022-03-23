package com.nuedu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BasePojo implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @JsonIgnore
    @TableField(exist = false)
    private Integer pageNo;
    @JsonIgnore
    @TableField(exist = false)
    private Integer pageSize;



}
