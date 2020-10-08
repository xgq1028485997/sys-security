package com.sys.security.controller.sql;

import com.sys.security.common.vo.ResultPageVO;
import com.sys.security.common.vo.ResultVO;
import com.sys.security.sql.SqlService;
import com.sys.security.vo.TableVO;
import com.sys.security.vo.TbOneVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SQL注入
 * 确认数据库类型
 *
 * @author 肖光清
 */
@Api(tags = "sql注入")
@RestController
@RequestMapping(("/sql"))
public class SqlController {

    @Autowired
    private SqlService sqlService;

    @ApiOperation(value = "测试", notes = "测试")
    @PostMapping("/test")
    public ResultVO<TbOneVO> test(@RequestBody TableVO vo){

        List<TbOneVO> list = sqlService.test(vo);

        ResultVO resultO = ResultPageVO.success(list);

        return resultO;
    }

    @ApiOperation(value = "sql注入", notes = "sql")
    @GetMapping("/injection/attack")
    public ResultVO<TbOneVO> sqlInjectionAttack(@RequestParam(value = "sql") String sql){

        List<TbOneVO> list = sqlService.injectionAttack(sql);

        ResultVO resultO = ResultPageVO.success(list);

        return resultO;
    }

}
