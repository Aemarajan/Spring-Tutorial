package com.ccoder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		//Define a Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		//Retrive a Bean using spring container
		Coach coach = context.getBean("myCoach",Coach.class);
		
		//Output
		System.out.println(coach.getDailyWorkout());
		
	}

}
