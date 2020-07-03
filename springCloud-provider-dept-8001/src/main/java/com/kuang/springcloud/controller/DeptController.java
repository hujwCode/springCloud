package com.kuang.springcloud.controller;


import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门表(Dept)表控制层
 *
 * @author makejava
 * @since 2020-06-29 16:34:48
 */
@RestController
@RequestMapping("dept")
public class DeptController {
    /**
     * 服务对象
     */
    @Resource
    private DeptService deptService;
    /**
     * 获取一些配置信息
     */
    @Autowired
    private DiscoveryClient client;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/get/{id}")
    public Dept selectOne(@PathVariable("id") Long id) {
        return this.deptService.queryById(id);
    }

    @PostMapping("/insert")
    public Dept insertDept(Dept dept){
        return deptService.insert(dept);
    }

    @GetMapping("/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    /**
     * 注册进来的微服务~，获取一些信息
     * @return
     */
    @GetMapping("/discovery")
    public Object discovery(){
        // 获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discover=>service: "+services);
        //得到一个具体的微服务信息,通过具体的微服务id
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost() + "\t" +
                    instance.getPort() + "\t" +
                    instance.getUri() + "\t" +
                    instance.getServiceId()
            );
        }
        return this.client;
    }
}