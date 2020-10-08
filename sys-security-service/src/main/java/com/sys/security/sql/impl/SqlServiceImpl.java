package com.sys.security.sql.impl;

import com.sys.security.dao.TbOneMapper;
import com.sys.security.sql.SqlService;
import com.sys.security.vo.TableVO;
import com.sys.security.vo.TbOneVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SqlServiceImpl implements SqlService {

    @Autowired
    private TbOneMapper tbOneMapper;

    public List<TbOneVO> injectionAttack(TableVO vo) {

        return tbOneMapper.select(vo);
    }

    @Override
    public List<TbOneVO> injectionAttack(String sql) {

        return tbOneMapper.selectBySql(sql);
    }

    @Override
    public List<TbOneVO> test(TableVO vo) {

        return tbOneMapper.select(vo);
    }
}
