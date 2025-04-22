package com.ccstudent.ccregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CcRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcRegistryServerApplication.class, args);
    }

}
