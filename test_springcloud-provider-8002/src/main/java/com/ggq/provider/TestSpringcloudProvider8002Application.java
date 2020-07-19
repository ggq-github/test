package com.ggq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TestSpringcloudProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringcloudProvider8002Application.class, args);
    }

}
