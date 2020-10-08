package com.sys.security.dao;

import com.sys.security.vo.UserResourceOperateVO;

import java.util.List;

public interface UserResourceOperateMapper {

    /**
     * 获取用户资源 权限
     * @param userId
     * @return
     */
    List<UserResourceOperateVO> findResourceByUser(String userId);
}
