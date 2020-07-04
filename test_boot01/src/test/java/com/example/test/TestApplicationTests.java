package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void redistest(){
        stringRedisTemplate.opsForValue().set("msg","hello World!");
        stringRedisTemplate.opsForValue().append("msg","pics");
        System.out.println(stringRedisTemplate.opsForValue().get("msg"));
    }

    @Test
    void contextLoads() throws SQLException {
        Connection connection= dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
