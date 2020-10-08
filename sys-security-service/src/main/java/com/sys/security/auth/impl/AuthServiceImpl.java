package com.sys.security.auth.impl;

import com.sys.security.auth.AuthService;
import com.sys.security.vo.UserResourceOperateVO;
import com.sys.security.dao.UserResourceOperateMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {

    private static final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

    @Autowired
    private UserResourceOperateMapper userResourceOperateMapper;

    @Override
    public List<UserResourceOperateVO> findResourceByUser(String userId) throws Exception{

        if(StringUtils.isEmpty(userId)){

            throw new Exception("用户ID不能为空");
        }

        List<UserResourceOperateVO> list = userResourceOperateMapper.findResourceByUser(userId);

        return list;
    }
}
