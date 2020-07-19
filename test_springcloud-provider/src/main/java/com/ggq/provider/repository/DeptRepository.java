package com.ggq.provider.repository;

import com.ggq.provider.entry.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: guogq
 * @date: 2020/7/18 19:41
 * @description: 功能描述：
 */
public interface DeptRepository  extends JpaRepository<Department,Integer> {
}
