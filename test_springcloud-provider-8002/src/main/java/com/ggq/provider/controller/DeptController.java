package com.ggq.provider.controller;

import com.ggq.provider.entry.Department;
import com.ggq.provider.repository.DeptRepository;
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
    public Department getDept(@PathVariable("id") Integer id){
        Optional<Department> department = deptRepository.findById(id);
        System.out.println("调用的是8002");
        return department.get();
    }
}
