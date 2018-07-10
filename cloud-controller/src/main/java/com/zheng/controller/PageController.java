package com.zheng.controller;

import com.zheng.mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 11:30
 */
@Controller
public class PageController {
   private Logger logger=LoggerFactory.getLogger(PageController.class);
   @RequestMapping("/index")
    public String index(Model model){
//    model.addAttribute("list",studentMapper.findStudentAll());
    logger.info("开始访问index页面");
    return "index";
  }
}
