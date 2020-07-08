package com.ggq.mail.controller;

import com.ggq.mail.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: guogq
 * @date: 2020/7/5 15:00
 * @description: 功能描述：
 */
@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/hello")
    public String hello(){
        taskService.task();
        return  "success";
    }
}
