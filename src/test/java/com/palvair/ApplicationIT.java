package com.palvair;

import com.palvair.microservices.AccountsServer;
import com.palvair.microservices.ServiceRegistrationServer;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by PALVAIRR on 21/12/2015.
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {ServiceRegistrationServer.class, AccountsServer.class})
@WebIntegrationTest({"server.port=1111", "eureka.client.serviceUrl.defaultZone=http://localhost:1111/eureka/"})
public class ApplicationIT {

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void test() {
        //ResponseEntity<String> results = restTemplate.getForEntity("http://localhost:8080/welcome", null, String.class);
        //final String body = results.getBody();
        //Assert.assertNotNull(body);
        //System.out.println("body = "+ body);
    }
}
