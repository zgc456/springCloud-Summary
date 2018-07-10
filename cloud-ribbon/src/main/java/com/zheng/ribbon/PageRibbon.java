package com.zheng.ribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 11:33
 */
@Controller
public class PageRibbon {
    @Autowired
    private RestTemplate restTemplate;
    private Logger logger=LoggerFactory.getLogger(PageRibbon.class);
    @RequestMapping(value = "/getIndex")
    public String getIndex() {
        logger.info("成功走入ribbon负载均衡  getIndex方法");
        return restTemplate.getForEntity("http://CLOUD-CONTROLLER/index", String.class).getBody();
    }
}
