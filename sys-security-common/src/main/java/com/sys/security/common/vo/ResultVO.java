package com.sys.security.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("返回结果视图")
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 8783264834035270863L;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("信息")
    private String msg;

    public static ResultVO success(String msg){

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultCode.success.getCode());
        resultVO.setMsg(msg);

        return resultVO;
    }

    public static ResultVO error(String msg){

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultCode.error.getCode());
        resultVO.setMsg(msg);

        return resultVO;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public enum ResultCode{
        success("000000", "成功"),
        error("000004", "失败");

        private String code;

        private String name;

        ResultCode(String code, String name){

            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
