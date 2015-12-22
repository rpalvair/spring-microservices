package com.palvair.microservices.services.web;

import com.palvair.microservices.accounts.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    public List<Account> getAllAccountsFromServer() {
        @SuppressWarnings("unchecked")
        Class<List<Account>> cls = (Class<List<Account>>) (Object) List.class;
        List<Account> accounts = restTemplate.getForObject(serviceUrl
                + "/getAllAccounts", List.class);
        if (accounts == null)
            throw new RuntimeException();
        else
            return accounts;
    }

    public Account getOne(Integer number) {
        Account account = restTemplate.getForObject(serviceUrl
                + "/account/{number}", Account.class, number.toString());
        if (account == null)
            throw new RuntimeException();
        else
            return account;
    }
}
