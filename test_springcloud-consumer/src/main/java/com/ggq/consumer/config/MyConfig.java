package com.ggq.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther: guogq
 * @date: 2020/7/18 19:22
 * @description: 功能描述：
 */
@Configuration
public class MyConfig {

    @Bean
    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。默认采用轮询策略
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }

    /**
     * IRule 是根据特定算法从 服务列表中选取一个要访问的服务
     * @return
     */
    @Bean
    public IRule getIRule(){
        return  new RandomRule();//负载均衡使用随机 覆盖之前默认的轮询策略
        //return new RetryRule();//先按照默认的轮询策略 去获取服务，如果有的服务宕机了，会在一定时间重试获取，获取不到就剔除掉此宕机的服务
    }

}
