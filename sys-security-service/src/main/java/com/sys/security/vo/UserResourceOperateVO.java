package com.sys.security.vo;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel(value = "用户资源操作")
public class UserResourceOperateVO implements Serializable {

    private static final long serialVersionUID = 8601288142957716570L;

    private String userId;

    private String resourceName;

    private String operateName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }
}
