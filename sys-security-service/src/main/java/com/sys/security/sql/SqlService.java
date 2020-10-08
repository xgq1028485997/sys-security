package com.sys.security.sql;

import com.sys.security.vo.TableVO;
import com.sys.security.vo.TbOneVO;

import java.util.List;

public interface SqlService {

    /**
     * sql注入攻击
     * @param sql
     * @return
     */
    List<TbOneVO> injectionAttack(String sql);

    /**
     * 测试
     * @param vo
     * @return
     */
    List<TbOneVO> test(TableVO vo);
}
