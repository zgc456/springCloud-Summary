package com.zheng.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/2 14:28
 */
@Configuration
@ComponentScan("com.zheng")
@MapperScan("com.zheng.mapper")
public class DataSourceConfig {
    public static Logger logger=LoggerFactory.getLogger(DataSourceConfig.class);
    @Autowired
    private ConfigurationConfig configurationConfig;
    @Bean
    public  DataSource dataSource(){
        DruidDataSource  druidDataSource=new DruidDataSource();
        druidDataSource.setUsername(configurationConfig.getUrername());
        druidDataSource.setPassword(configurationConfig.getPassword());
        druidDataSource.setUrl(configurationConfig.getUrl());
        druidDataSource.setDriverClassName(configurationConfig.getDriver());
        return druidDataSource;
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource){
        logger.info("数据源加载成功");
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver=new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources("mybatis/*.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("数据库连接正常");
        return sqlSessionFactoryBean;
    }
}
