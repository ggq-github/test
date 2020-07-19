package com.ggq.consumer.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther: guogq
 * @date: 2020/7/18 20:15
 * @description: 功能描述：
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {

    private Integer id;
    private String departmentName;
}


