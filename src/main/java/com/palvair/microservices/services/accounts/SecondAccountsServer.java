package com.palvair.microservices.services.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@SpringBootApplication
@EnableDiscoveryClient
//@Import(AccountsWebApplication.class)
public class SecondAccountsServer {
    public static void main(String[] args) {
        // Will configure using accounts-server.yml
        System.setProperty("spring.config.name", "accounts-server2");

        SpringApplication.run(SecondAccountsServer.class, args);
    }

}
