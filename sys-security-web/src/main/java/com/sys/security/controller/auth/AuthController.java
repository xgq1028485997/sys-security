package com.sys.security.controller.auth;

import com.sys.security.auth.AuthService;
import com.sys.security.common.vo.ResultPageVO;
import com.sys.security.common.vo.ResultVO;
import com.sys.security.vo.UserResourceOperateVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户越权体现：
 *      功能
 *      接口
 *      数据
 */
@RestController
@RequestMapping(value = "/auth")
@Api(tags = "用户越权")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/find/user/resource")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true)
    })
    public ResultVO<UserResourceOperateVO> findResourceByUser(@RequestParam String userId) throws Exception {

        List<UserResourceOperateVO> list = authService.findResourceByUser(userId);

        return ResultPageVO.success(list);
    }

}
