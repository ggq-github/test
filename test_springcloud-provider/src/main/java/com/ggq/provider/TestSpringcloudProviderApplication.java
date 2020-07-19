package com.ggq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
@SpringBootApplication
public class TestSpringcloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringcloudProviderApplication.class, args);
    }

}
