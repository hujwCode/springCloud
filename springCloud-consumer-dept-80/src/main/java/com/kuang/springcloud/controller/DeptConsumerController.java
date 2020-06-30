package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author creator hujw 2020/6/29 17:53
 * @author updater
 * @version 1.0.0
 */
@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

    // 理解：消费者，不应该有service层
    // RestTemplate 供我们直接调用就行了！ 注册到spring 中
    // (url, 实体：Map , Class<T> responseType)
    @Autowired
    private RestTemplate restTemplate;  //提供多种边界访问远程http服务的方法，简单的Restful服务模板~

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/dept/insert")
    public Dept insert(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/insert", dept, Dept.class);
    }

    @RequestMapping("/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

}
