package com.sys.security.auth;

import com.sys.security.vo.UserResourceOperateVO;

import java.util.List;

public interface AuthService {

    /**
     * 获取用户资源权限
     * @param userId
     * @return
     */
    List<UserResourceOperateVO> findResourceByUser(String userId) throws Exception;
}
