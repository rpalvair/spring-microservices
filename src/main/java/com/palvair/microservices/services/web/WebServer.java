package com.palvair.microservices.services.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters=false)
public class WebServer {



    public static void main(String[] args) {
        // Tell server to look for web-server.properties or web-server.yml
        System.setProperty("spring.config.name", "web-server");
        SpringApplication.run(WebServer.class, args);
    }

    @Bean
    public WebController accountsController() {
        // 1. Value should not be hard-coded, just to keep things simple
        //        in this example.
        // 2. Case insensitive: could also use: http://accounts-service
        return new WebController();  // serviceUrl
    }

    @Bean
    public WebAccountService accountService() {
        return new WebAccountService();
    }


}
