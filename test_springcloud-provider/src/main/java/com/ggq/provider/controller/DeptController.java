package com.ggq.provider.controller;

import com.ggq.provider.entry.Department;
import com.ggq.provider.repository.DeptRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @auther: guogq
 * @date: 2020/7/18 19:40
 * @description: 功能描述：
 */
@RestController
public class DeptController {

    @Autowired
    DeptRepository deptRepository;

    @GetMapping("/dept/{id}")
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Department getDept(@PathVariable("id") Integer id){
        Optional<Department> department = deptRepository.findById(id);
        if(department.get()==null){
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }

        return department.get();
    }

    public Department processHystrix_Get(@PathVariable("id") Integer id)
    {
        return new Department().setId(id).setDepartmentName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
    }
}
