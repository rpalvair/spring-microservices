package com.palvair.microservices.services.accounts;

import com.palvair.microservices.accounts.AccountWebApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@SpringBootApplication
@EnableDiscoveryClient
//include the web app as a microservice
@Import(AccountWebApplication.class)
public class AccountsServer {
    public static void main(String[] args) {
        // Will configure using accounts-server.yml
        System.setProperty("spring.config.name", "accounts-server");

        SpringApplication.run(AccountsServer.class, args);
    }

}
