package com.palvair.microservices.accounts;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@RestController
public class AccountController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    /*@RequestMapping("/accounts/{number}")
    public Account getByNumber(@PathVariable("number") String accountNumber) {
        final Account account = new Account("widdy");

        return account;

    }*/

    @RequestMapping("/getAllAccounts")
    public List<Account> getAllAccounts() {
        final List<Account> accounts = new ArrayList<Account>();
        final Account account = new Account("widdy");
        accounts.add(account);
        return accounts;
    }

    @RequestMapping("/account/{number}")
    public Account getOne(@PathVariable("number") String number) {
        final Account account = new Account("widdy");
        account.setNumber(Integer.valueOf(number));
        return account;
    }
}
