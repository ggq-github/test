//package com.ggq.consumer.controller;
//
//import com.ggq.springcloud.api.ProviderApi;
//import com.ggq.springcloud.entry.Department;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @auther: guogq
// * @date: 2020/7/19 14:24
// * @description: 功能描述：
// */
//@RestController
//public class DeptControllerFeign {
//
//    //@Autowired
//   // private ProviderApi providerApi;
//
//    @GetMapping("/dept/add/{id}")
//    public Department add(@PathVariable int id ){
//        return providerApi.getDept(id);
//    }
//
//}
