package com.zheng.mapper;

import com.zheng.entity.ClassesEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/2 17:09
 */
@Repository
public interface StudentMapper {
    List<ClassesEntity> findStudentAll();
}
