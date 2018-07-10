package com.zheng.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 远程配置读取
 *
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/7/2 14:28
 */
@Configuration
public class ConfigurationConfig {
    @Value("${spring.datasource.username}")
    private String urername;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String Driver;
    @Value("${spring.datasource.url}")
    private String url;


    public String getUrername() {
        return urername;
    }

    public void setUrername(String urername) {
        this.urername = urername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
