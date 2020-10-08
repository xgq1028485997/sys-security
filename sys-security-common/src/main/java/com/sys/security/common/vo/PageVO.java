package com.sys.security.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "分页视图")
public class PageVO implements Serializable {

    private static final long serialVersionUID = 5605463660345367389L;

    @ApiModelProperty(value = "总数")
    private long total;

    @ApiModelProperty(value = "每页条数")
    private Integer pageSize;

    @ApiModelProperty(value = "当前页数")
    private Integer pageNum;


    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
