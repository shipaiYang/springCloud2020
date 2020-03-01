package org.cloud.ysp.service;

import feign.hystrix.FallbackFactory;
import org.cloud.ysp.entity.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author pai
 * @date 2020/2/29
 */
@Component //不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该ID:"+id+"没有对应用的信息,consumer客户端提供降级信息，此刻provider已经关闭").setDbSource("no this database in MYSQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
