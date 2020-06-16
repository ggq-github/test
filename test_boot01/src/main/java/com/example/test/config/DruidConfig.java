package com.example.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: guogq
 * @date: 2020/6/16 15:42
 * @description: 功能描述： 阿里数据源配置
 */
@Configuration
public class DruidConfig {


    @ConfigurationProperties(prefix =  "spring.datasource")
    @Bean
    public DataSource druidSource(){
        return new DruidDataSource();
    }

    /**
     * 1. 配置durid监控
     * 配置一个后台管理的sevlet
     * @return
     */
    @Bean
    public ServletRegistrationBean  statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");//设置后台登录名
        initParams.put("loginPassword","123456");//设置后台登录密码
        initParams.put("allow","");//默认就是允许所有访问 ,设置允许的IP访问
        initParams.put("deny","");//拒绝的IP的访问
        bean.setInitParameters(initParams);
        return bean;
    }
    /**
     * 2、配置一个web监控的filter
     * @return
     */
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return  bean;
    }
}
