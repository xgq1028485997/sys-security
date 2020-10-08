package com.sys.security.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "表一视图")
public class TbOneVO implements Serializable {

    private static final long serialVersionUID = 785266468336097083L;

    @ApiModelProperty(value = "num", name = "编号")
    private String num;

    @ApiModelProperty(value = "name", name = "姓名")
    private String name;

    @ApiModelProperty(value = "num", name = "班级")
    private String clazz;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
