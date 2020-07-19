package com.ggq.consumer;

import com.ggq.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient
@SpringBootApplication
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name="TEST-SPRINGCLOUD-PROVIDER",configuration= MySelfRule.class)
public class TestSpringcloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringcloudConsumerApplication.class, args);
    }

}
