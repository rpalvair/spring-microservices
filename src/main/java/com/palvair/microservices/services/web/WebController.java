package com.palvair.microservices.services.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
