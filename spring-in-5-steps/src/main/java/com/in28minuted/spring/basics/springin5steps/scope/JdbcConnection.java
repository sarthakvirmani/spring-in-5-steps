package com.in28minuted.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


//Whenever we are trying to access prototype scope using a bean to a dependency we need to use proxy otherwise it will make the same instance.
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

	public JdbcConnection() {
		System.out.print("jdbcconnection");
	}
	

}
