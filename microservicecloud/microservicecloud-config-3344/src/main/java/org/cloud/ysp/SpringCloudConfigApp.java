package org.cloud.ysp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author pai
 * @date 2020/2/29
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigApp.class,args);
    }
}
