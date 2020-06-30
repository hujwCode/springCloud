package com.kuang.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author creator hujw 2020/6/29 17:53
 * @author updater
 * @version 1.0.0
 */
@Controller
@RequestMapping("/consumer")
public class DeptConsumerController {

    // 理解：消费者，不应该有service层
    // TestTemplate 供我们直接调用就行了！ 注册到spring 中
}
