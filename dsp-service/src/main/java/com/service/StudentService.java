package com.service;

import com.entity.Student;
import com.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xzy
 * @since 2020-01-20
 */
@Service
public class StudentService  {

    @Autowired
    private StudentMapper stuMapper;

    public StudentMapper getStuMapper() {
        return stuMapper;
    }
}
