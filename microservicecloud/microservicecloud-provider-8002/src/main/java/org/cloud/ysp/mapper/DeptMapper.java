package org.cloud.ysp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.ysp.entity.Dept;

import java.util.List;

/**
 * @author pai
 * @date 2020/2/20
 */
@Mapper
public interface DeptMapper {

    Dept findById(Long Id);

    List<Dept> findAll();

    boolean addDept(Dept dept);



}
