package com.zheng.api;

import com.zheng.dto.ClassesDTO;
import org.hibernate.validator.constraints.EAN;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 10:00
 */

public interface StudentService {
     List<ClassesDTO> selectClassesAll();
}
