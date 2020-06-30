package com.kuang.springcloud.dao;

import com.kuang.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 部门表(Dept)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-29 16:26:06
 */
@Mapper
@Repository
public interface DeptDao {

    /**
     * 通过ID查询单条数据
     *
     * @param deptno 主键
     * @return 实例对象
     */
    Dept queryById(Long deptno);


    List<Dept> queryAll();
    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 影响行数
     */
    int insert(Dept dept);


}