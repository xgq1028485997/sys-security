package com.sys.security.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "表信息")
public class TableVO implements Serializable {

    private static final long serialVersionUID = 5972917376018659689L;

    @ApiModelProperty(value = "表名称")
    private String tableName;

    @ApiModelProperty(value = "主键")
    private String primaryKey;

    @ApiModelProperty("主键值")
    private String primaryKeyValue;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getPrimaryKeyValue() {
        return primaryKeyValue;
    }

    public void setPrimaryKeyValue(String primaryKeyValue) {
        this.primaryKeyValue = primaryKeyValue;
    }
}
