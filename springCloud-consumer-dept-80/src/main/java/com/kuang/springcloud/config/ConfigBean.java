package com.kuang.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author creator hujw 2020/6/30 9:15
 * @author updater
 * @version 1.0.0
 */
@Configuration
public class ConfigBean {  //@configuration == spring -> applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
