package com.mapper;

import com.entity.SecondCate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 高永佳
 */


public interface SecondCateMapper {

    List<SecondCate> getAll();

}
