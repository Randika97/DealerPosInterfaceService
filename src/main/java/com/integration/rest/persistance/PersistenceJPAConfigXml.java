package com.integration.rest.persistance;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// @Configuration
@EnableTransactionManagement
@ComponentScan({ "com.intergration.rest" })
@ImportResource({ "classpath:spring-hibernate-jax-ws.xml" })
public class PersistenceJPAConfigXml {

    public PersistenceJPAConfigXml() {
        super();
    }

}
