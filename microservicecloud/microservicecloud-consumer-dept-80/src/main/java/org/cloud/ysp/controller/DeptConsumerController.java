package org.cloud.ysp.controller;

import org.cloud.ysp.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author pai
 * @date 2020/2/20
 */
@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

//    private static final String URL_PREFIX = "http://localhost:8001/dept";
    private static final String URL_PREFIX = "http://MICROSERVICECLOUD-DEPT/dept";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL_PREFIX + "/get/" + id, Dept.class);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return restTemplate.getForObject(URL_PREFIX + "/list", List.class);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(Dept dept) {
        return restTemplate.postForObject(URL_PREFIX + "/add", dept, Boolean.class);
    }

}
