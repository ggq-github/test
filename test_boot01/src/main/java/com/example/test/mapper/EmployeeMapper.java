package com.example.test.mapper;

import com.example.test.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther: guogq
 * @date: 2020/6/4 13:47
 * @description: 功能描述：使用mybatis 配置版操作数据库
 */
//或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper  {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

    public int updateEmp(Employee employee);
}
