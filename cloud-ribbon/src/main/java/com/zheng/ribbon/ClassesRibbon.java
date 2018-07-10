package com.zheng.ribbon;

import com.zheng.dto.ClassesDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 11:19
 */
@RestController
public class ClassesRibbon {
    @Autowired
   private RestTemplate restTemplate;
    private Logger logger=LoggerFactory.getLogger(ClassesRibbon.class);
    @RequestMapping(value = "/getClasses")
    public List<ClassesDTO> add() {

        logger.info("成功走入ribbon负载均衡 getIndex方法");
        return restTemplate.getForEntity("http://CLOUD-CONTROLLER/selectAll", List.class).getBody();
    }
}
