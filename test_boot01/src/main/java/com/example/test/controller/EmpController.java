package com.example.test.controller;

import com.example.test.bean.Employee;
import com.example.test.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @auther: guogq
 * @date: 2020/6/4 13:47
 * @description: 功能描述：
 */
@RestController
public class EmpController {
    @Autowired//使用JDBC执行SQL
    JdbcTemplate jdbcTemplate;
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    @ResponseBody
    public Map<String,Object>  query(){
       List<Map<String,Object>> list =  jdbcTemplate.queryForList("select * from department");
       return list.get(0);
    }
    @GetMapping("/emp/{id}")
    public Employee getById(@PathVariable("id") Integer id){
        Employee employee = employeeService.getEmp(id);
        return employee;
    }

    @GetMapping("/emp")
    public Employee updateEmp(Employee employee){
        Employee emp = employeeService.updateEmp(employee);
        return emp;
    }
}
