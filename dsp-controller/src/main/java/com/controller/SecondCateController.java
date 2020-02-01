package com.controller;

import com.alibaba.fastjson.JSON;
import com.entity.SecondCate;
import com.service.SecondCateService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author 高永佳
 */

@Controller
public class SecondCateController {

    private static Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    SecondCateService service;

    @ResponseBody
    @RequestMapping(value = "/secate",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String getAll(){
        List<SecondCate> list = service.getScMapper().getAll();
        return JSON.toJSONString(list);
    }

}
