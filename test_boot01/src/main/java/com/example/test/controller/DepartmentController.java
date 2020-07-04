package com.example.test.controller;

import com.example.test.bean.Department;
import com.example.test.bean.Employee;
import com.example.test.mapper.DepartmentMapper;
import com.example.test.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: guogq
 * @date: 2020/6/16 17:44
 * @description: 功能描述：
 */

@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }



}

