package com.kuang.springcloud.service;


import com.kuang.springcloud.pojo.Dept;

import java.util.List;

/**
 * 部门表(Dept)表服务接口
 *
 * @author makejava
 * @since 2020-06-29 16:34:46
 */
public interface DeptService {

    /**
     * 通过ID查询单条数据
     *
     * @param deptno 主键
     * @return 实例对象
     */
    Dept queryById(Long deptno);

    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    Dept insert(Dept dept);



    List<Dept> queryAll();
}