package com.zheng.testredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 7:26
 */
@RestController
public class TestRedis {
 @Autowired
 private StringRedisTemplate stringRedisTemplate;
 @RequestMapping("getRedisKey")
 public String getRedisKey(){
    return stringRedisTemplate.opsForValue().get("14");
 }
}
