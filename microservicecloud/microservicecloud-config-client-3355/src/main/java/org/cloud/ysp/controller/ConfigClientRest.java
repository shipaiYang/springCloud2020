package org.cloud.ysp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pai
 * @date 2020/3/1
 */
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getConfig")
    public String getConfig(){
        String str = "applicationName:"+applicationName+"\t"+"eurekaServer:"+eurekaServer+"\t"+"port:"+port;
        return str;
    }
}
