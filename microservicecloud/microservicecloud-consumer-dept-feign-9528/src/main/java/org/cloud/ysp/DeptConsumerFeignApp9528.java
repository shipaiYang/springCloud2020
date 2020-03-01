package org.cloud.ysp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author pai
 * @date 2020/2/20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DeptConsumerFeignApp9528 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApp9528.class,args);
    }
}
