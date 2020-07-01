package com.kuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author creator hujw 2020/7/1 16:17
 * @author updater
 * @version 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class springCloudEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(springCloudEurekaServer.class,args);
    }
}