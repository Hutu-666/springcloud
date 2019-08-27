package com.example.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   // 客户端开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    // 使用随机算法
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
