package com.zheng.service;

import com.zheng.ConvertList;
import com.zheng.api.StudentService;
import com.zheng.config.DataSourceConfig;
import com.zheng.dto.ClassesDTO;
import com.zheng.mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 9:59
 */
@Service
public class StudentServletImpl implements StudentService {
  private static Logger logger=LoggerFactory.getLogger(DataSourceConfig.class);
  @Autowired
  private StudentMapper studentMapper;

    @Override
    public List<ClassesDTO> selectClassesAll() {
      List<ClassesDTO> list=new ArrayList<>();
      logger.info("执行查询方法");
        return ConvertList.convertToList(list,studentMapper.findStudentAll(),"com.zheng.entity.ClassesEntity");
    }
}
