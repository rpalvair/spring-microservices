package com.palvair.microservices.services.web;

import com.palvair.microservices.accounts.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@Service
public class WebAccountService {

    @Autowired        // Created automatically by Spring Cloud
    @LoadBalanced
    protected RestTemplate restTemplate;

    protected String serviceUrl = "http://ACCOUNTS-SERVICE";

    public Account getByNumber(String accountNumber) {
        Account account = restTemplate.getForObject(serviceUrl
                + "/accounts/{number}", Account.class, accountNumber);

        if (account == null)
            throw new RuntimeException(accountNumber);
        else
            return account;
    }

}
