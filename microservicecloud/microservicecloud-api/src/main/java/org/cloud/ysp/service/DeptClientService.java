package org.cloud.ysp.service;

import org.cloud.ysp.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//@FeignClient("microservicecloud-dept")
@FeignClient(value = "microservicecloud-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
@RequestMapping("/dept")
public interface DeptClientService {
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    boolean add(Dept dept);

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Dept> list();
}
