package com.kuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author creator hujw 2020/6/29 16:45
 * @author updater
 * @version 1.0.0
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class Deptprovider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(Deptprovider_8001.class,args);
    }
}
