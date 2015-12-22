package com.palvair.microservices.accounts;

import lombok.Data;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@Data
public class Account {

    public Account() {

    }

    private String  owner;

    private Integer number;

    public Account(final String owner){
        this.owner = owner;
    }

}
