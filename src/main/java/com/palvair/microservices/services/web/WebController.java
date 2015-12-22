package com.palvair.microservices.services.web;

import com.palvair.microservices.accounts.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@RestController
public class WebController {

    @Autowired
    private WebAccountService accountService;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/getAllAccountsFromServer")
    public List<Account> getAllAccountsFromServer() {
        return accountService.getAllAccountsFromServer();
    }

    @RequestMapping("/getOneFromServer/{number}")
    public Account getOneFromServer(@PathVariable("number") String number) {
        return accountService.getOne(Integer.valueOf(number));
    }
}
