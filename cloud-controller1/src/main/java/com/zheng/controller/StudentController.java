package com.zheng.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zheng.api.StudentService;
import com.zheng.dto.ClassesDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 10:47
 */
@RestController
//@RefreshScope
public class StudentController {
    @Autowired
   private StudentService studentService;
    private Logger logger=LoggerFactory.getLogger(StudentController.class);
    //熔断处理
    @HystrixCommand(fallbackMethod = "error")

    @RequestMapping("/selectAll")
    public List<ClassesDTO> selectClassesAll(){
        System.out.println("调用controller服务 的方法，端口号8007");
        logger.info("调用selectAll方法，端口号8007");
        return studentService.selectClassesAll();
    }


    @GetMapping("/error")
    public List<ClassesDTO> error(){
        logger.info("调用selectAll方法，端口号出错了");
        System.out.println("出错了");
        return new ArrayList<>();
    }
}
