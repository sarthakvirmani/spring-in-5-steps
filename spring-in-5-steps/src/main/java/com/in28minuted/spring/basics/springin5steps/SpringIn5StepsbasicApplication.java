package com.in28minuted.spring.basics.springin5steps;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minuted.spring.basics.springin5steps.basic.BinarySearchImpl;

@ComponentScan("com.in28minuted.spring.basics.springin5steps")
public class SpringIn5StepsbasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsbasicApplication.class, args);
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
}