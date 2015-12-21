package com.palvair.microservices.accounts;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@RestController
public class AccountController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/accounts/{number}")
    public Account getByNumber(@PathVariable("number") String accountNumber) {
        final Account account = new Account("widdy");

        return account;

    }

    @RequestMapping("/accounts")
    public Account getAccounts() {
        final Account account = new Account("widdy");

        return account;
    }
}
