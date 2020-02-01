package com.service;

import com.mapper.SecondCateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 高永佳
 */
@Service
public class SecondCateService {
    @Autowired
    private SecondCateMapper scMapper;

    public SecondCateMapper getScMapper() {
        return scMapper;
    }
}
