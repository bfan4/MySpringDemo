//package com.luv2code.springdemo;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class HelloSpringApp {
//
//	public static void main(String[] args) {
//		
//		//load the spring
//		ClassPathXmlApplicationContext context = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		//retrieve
//		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
//		
//		//call methods
//		System.out.println(theCoach.getDailyWorkout());
//		
//		System.out.println(theCoach.getDailyFortune());
//		
//		System.out.println(theCoach.getTeam());
//		
//		System.out.println(theCoach.getEmailAddress());
//		
//		
//		
//		//close the context
//		context.close();
//	}
//
//}
