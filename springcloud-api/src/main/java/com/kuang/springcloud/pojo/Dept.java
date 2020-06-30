package com.kuang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author creator hujw 2020/6/29 15:30
 * @author updater
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式存储
public class Dept implements Serializable {
    /**
     * 部门号
     */
    private Long deptno;
    /**
     * 部门名称
     */
    private String dname;
    /**
     * 数据存在哪个数据库
     */
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }

}
