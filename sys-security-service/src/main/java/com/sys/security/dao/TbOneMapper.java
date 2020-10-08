package com.sys.security.dao;

import com.sys.security.vo.TableVO;
import com.sys.security.vo.TbOneVO;

import java.util.List;

public interface TbOneMapper {

    /**
     * 查询
     * @param vo
     * @return
     */
    List<TbOneVO> select(TableVO vo);

    /**
     * sql参数
     * @param sql
     * @return
     */
    List<TbOneVO> selectBySql(String sql);
}
