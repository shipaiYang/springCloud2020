package org.cloud.ysp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author pai
 * @date 2020/2/20
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker
@EnableHystrix
public class DeptProviderHystrixApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrixApp8001.class,args);

    }
}
