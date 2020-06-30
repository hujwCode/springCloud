package com.kuang.springcloud.service.impl;


import com.kuang.springcloud.dao.DeptDao;
import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门表(Dept)表服务实现类
 *
 * @author makejava
 * @since 2020-06-29 16:34:47
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    /**
     * 通过ID查询单条数据
     *
     * @param deptno 主键
     * @return 实例对象
     */
    @Override
    public Dept queryById(Long deptno) {
        return this.deptDao.queryById(deptno);
    }


    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    @Override
    public Dept insert(Dept dept) {
        this.deptDao.insert(dept);
        return dept;
    }


    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}