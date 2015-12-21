package com.palvair.microservices.accounts;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@SpringBootApplication
@Import(McvConfig.class)
public class AccountWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountWebApplication.class, args);
    }


}
