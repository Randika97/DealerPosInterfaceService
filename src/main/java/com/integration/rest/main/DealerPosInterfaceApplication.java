package com.integration.rest.main;

import com.integration.rest.controller.AuthController;
import com.integration.rest.controller.TestController;
import com.integration.rest.service.UserDetailsServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.integration.rest.controller.DealerPosInterfaceController;
import com.integration.rest.service.DealerPosInterfaceServiceImpl;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScans(value = {@ComponentScan(basePackageClasses = DealerPosInterfaceController.class),
						@ComponentScan(basePackageClasses = DealerPosInterfaceServiceImpl.class),
						@ComponentScan(basePackageClasses = AuthController.class),
						@ComponentScan(basePackageClasses = TestController.class),
						@ComponentScan(basePackageClasses = UserDetailsServiceImpl.class),

})
//EnableJPA repository from Java code base level
//@EnableJpaRepositories(basePackages = "com.integration.rest.repository",entityManagerFactoryRef = "myEmf",transactionManagerRef = "JpatransactionManager")
@EntityScan(basePackages = "com.integration.rest.model")
@EnableAutoConfiguration
@EnableTransactionManagement
public class DealerPosInterfaceApplication {

	public static void main(String[] args) {
		 SpringApplication.run(DealerPosInterfaceApplication.class, args);
	}
	

}
