package com.ggq.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//开启定时任务注解
@EnableAsync//开启异步任务注解
@SpringBootApplication
public class TestMailApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMailApplication.class, args);
    }

}
