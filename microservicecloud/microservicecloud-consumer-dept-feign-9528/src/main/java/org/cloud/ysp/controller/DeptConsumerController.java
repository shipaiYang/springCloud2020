package org.cloud.ysp.controller;

import org.cloud.ysp.entity.Dept;
import org.cloud.ysp.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author pai
 * @date 2020/2/20
 */
@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptClientService.list();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

}
