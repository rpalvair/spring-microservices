package com.palvair.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@org.springframework.web.bind.annotation.RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/welcome",  method = RequestMethod.GET)
    public String welcome()
    {
        return "Hello";
    }
}
