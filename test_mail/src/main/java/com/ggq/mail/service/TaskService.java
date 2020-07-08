package com.ggq.mail.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @auther: guogq
 * @date: 2020/7/5 15:02
 * @description: 功能描述：异步处理
 */
@Service
public class TaskService {
    @Async
    public void task() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("该线程睡眠了3秒");
    }
}
