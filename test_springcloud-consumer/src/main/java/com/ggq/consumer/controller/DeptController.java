package com.ggq.consumer.controller;

import com.ggq.consumer.entry.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther: guogq
 * @date: 2020/7/18 19:22
 * @description: 功能描述：
 */
@RestController
public class DeptController {

    private static String  URL="http://TEST-SPRINGCLOUD-PROVIDER";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/dept/add/{id}")
    public Department add(@PathVariable String id ){
        return restTemplate.getForObject(URL+"/dept/"+id,Department.class);
    }
}
