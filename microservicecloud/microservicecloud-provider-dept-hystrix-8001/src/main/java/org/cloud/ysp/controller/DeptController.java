package org.cloud.ysp.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.cloud.ysp.entity.Dept;
import org.cloud.ysp.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pai
 * @date 2020/2/20
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    //一量调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod指定的方法
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id) {

        Dept dept = deptService.get(id);
        if(dept==null){
            throw new RuntimeException();
        }
        return dept;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }



    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("该ID:"+id+"没有对应用的信息,null----@hystrixCommand").setDbSource("no this database in MYSQL");
    }
}
