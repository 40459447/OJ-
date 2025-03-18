package com.djp.djpbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.djp.djpbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.djp")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.djp.djpbackendserviceclient.service"})
public class djpbackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(djpbackendQuestionServiceApplication.class, args);
    }

}
