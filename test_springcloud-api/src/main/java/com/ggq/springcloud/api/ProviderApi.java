package com.ggq.springcloud.api;

import com.ggq.springcloud.entry.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @auther: guogq
 * @date: 2020/7/19 14:21
 * @description: 功能描述：
 */
@FeignClient(value = "TEST-SPRINGCLOUD-PROVIDER")
public interface ProviderApi {

    @GetMapping("/dept/{id}")
    Department getDept( Integer id);


}
