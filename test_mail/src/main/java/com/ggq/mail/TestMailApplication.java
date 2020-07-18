package com.ggq.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//开启定时任务注解
@EnableAsync//开启异步任务注解
@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
public class TestMailApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMailApplication.class, args);
    }

}
