package com.ggq.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class TestSpringcloudZuulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringcloudZuulGatewayApplication.class, args);
    }

}
