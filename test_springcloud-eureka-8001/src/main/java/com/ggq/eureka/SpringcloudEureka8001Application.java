package com.ggq.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEureka8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka8001Application.class, args);
    }

}
