package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;

/**
 * @auther: guogq
 * @date: 2020/6/4 13:47
 * @description: 功能描述：
 */
@Controller
public class EmpController {
    @Autowired//使用JDBC执行SQL
    JdbcTemplate jdbcTemplate;

    @GetMapping
    @ResponseBody
    public Map<String,Object>  query(){
       List<Map<String,Object>> list =  jdbcTemplate.queryForList("select * from department");
       return list.get(0);
    }
}
