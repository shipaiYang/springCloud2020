package org.cloud.ysp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pai
 * @date 2020/3/1
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderConfigClientApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderConfigClientApp.class,args);
    }
}
