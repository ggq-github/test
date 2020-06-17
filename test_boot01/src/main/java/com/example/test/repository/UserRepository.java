package com.example.test.repository;

import com.example.test.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @auther: guogq
 * @date: 2020/6/4 13:47
 * @description: 功能描述：必须继承JpaRepository 才可以完成对数据库的操作
 */
//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {
}
