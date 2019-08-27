package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfig3344_App {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig3344_App.class, args);
    }
}
