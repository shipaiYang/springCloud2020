package org.cloud.ysp.service;

import org.cloud.ysp.entity.Dept;

import java.util.List;

public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
