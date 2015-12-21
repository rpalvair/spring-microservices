package com.palvair.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {
    public static void main(String[] args) {
        // Tell Boot to look for registration-server.yml
        System.setProperty("spring.config.name", "registration-server");
        SpringApplication.run(ServiceRegistrationServer.class, args);
    }
}
