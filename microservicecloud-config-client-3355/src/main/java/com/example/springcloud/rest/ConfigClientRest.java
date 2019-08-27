package com.example.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 读取GitHub文件中的值
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public Map<String, String> getConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("applicationName", applicationName);
        map.put("eurekaServers", eurekaServers);
        map.put("port", port);
        System.out.println(map.toString());
        return map;
    }
}
