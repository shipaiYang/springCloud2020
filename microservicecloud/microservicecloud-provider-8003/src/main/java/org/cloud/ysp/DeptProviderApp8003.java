package org.cloud.ysp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pai
 * @date 2020/2/20
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProviderApp8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApp8003.class,args);

    }
}
