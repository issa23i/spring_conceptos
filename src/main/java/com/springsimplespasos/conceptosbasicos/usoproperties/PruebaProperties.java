package com.springsimplespasos.conceptosbasicos.usoproperties;

import com.springsimplespasos.conceptosbasicos.usoproperties.herencia.ReadBarProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PruebaProperties implements CommandLineRunner {
    @Autowired
    ReadCommonProperties commonProperties;
    @Autowired
    ReadFooProperties readFooProperties;
    @Autowired
    ReadBarProperties readBarProperties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("app.base.url: " + commonProperties.getBaseUrl());
        System.out.println("=================================================");
        System.out.println("app.foo.client: " + readFooProperties.getClientUrl());
        System.out.println("app.foo.customer: " + readFooProperties.getCustomerUrl());
        System.out.println("=================================================");
        System.out.println("bar.name: " + readBarProperties.getName());
        System.out.println("bar.url.client: " + readBarProperties.getUrl().getClient());
        System.out.println("bar.url.customer: " + readBarProperties.getUrl().getCustomer());
    }
}
