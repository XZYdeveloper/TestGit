package com.controller;



import com.entity.Student;
import com.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController {

    private static Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    StudentService us;

    @RequestMapping("/")
    public String index()
    {
        return "index.html";
    }

    @RequestMapping(value = {"/addstu"},method = RequestMethod.GET)
    public String addStudent(Model model){

        List<Student> list = us.getStuMapper().hasNum();
        System.out.println(list.size());
        logger.info("Controller测试日志");
        return "success.html";
    }
}
