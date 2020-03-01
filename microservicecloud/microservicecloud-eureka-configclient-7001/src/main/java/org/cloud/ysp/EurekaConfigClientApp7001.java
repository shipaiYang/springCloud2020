package org.cloud.ysp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author pai
 * @date 2020/2/22
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaConfigClientApp7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClientApp7001.class,args);
    }
}
