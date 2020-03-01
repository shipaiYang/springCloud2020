package org.cloud.ysp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author pai
 * @date 2020/2/29
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashBoardApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoardApp.class,args);
    }
}
