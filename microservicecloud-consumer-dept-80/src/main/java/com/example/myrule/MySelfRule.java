package com.example.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义特定服务负载均衡算法
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        //return new RandomRule();
        return new RandomRule_MY();
    }
}
