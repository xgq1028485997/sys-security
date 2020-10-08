package com.sys.security.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("返回分页数据集视图")
public class ResultPageVO<T> extends ResultVO {

    private static final long serialVersionUID = 7761373522901060347L;

    @ApiModelProperty(value = "结果集")
    private T data;

    @ApiModelProperty(value = "分页信息")
    private PageVO page;

    public static ResultPageVO success(Object data){

        ResultPageVO resultPageVO = new ResultPageVO();
        resultPageVO.setCode(ResultCode.success.getCode());
        resultPageVO.setMsg(ResultCode.success.getName());
        resultPageVO.setData(data);
        return resultPageVO;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public PageVO getPage() {
        return page;
    }

    public void setPage(PageVO page) {
        this.page = page;
    }
}
