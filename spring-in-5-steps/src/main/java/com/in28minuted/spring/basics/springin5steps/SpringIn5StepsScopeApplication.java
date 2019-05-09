package com.in28minuted.spring.basics.springin5steps;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minuted.spring.basics.springin5steps.scope.PersonDao;

import ch.qos.logback.classic.Logger;

@ComponentScan("com.in28minuted.spring.basics.springin5steps")
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER=(Logger) LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {

		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDao persondao = 
				applicationContext.getBean(PersonDao.class);
		PersonDao persondao2 = 
				applicationContext.getBean(PersonDao.class);
		
		LOGGER.info("{}",persondao); 
		LOGGER.info("{}",persondao.getJdbcconnection());
		LOGGER.info("{}",persondao2);
		LOGGER.info("{}",persondao2.getJdbcconnection());
		
	}
}