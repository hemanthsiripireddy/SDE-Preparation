package com.hemanth.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("----------the Cricket Coach--------------------");
		SportsCoach sportsCoach=ctx.getBean("cricketCoach",SportsCoach.class);
		System.out.println("The timing is: "+sportsCoach.getTrainingSchedule());
		System.out.println("The Advice is: "+sportsCoach.getAdvice());
		System.out.println("----------------The Football Coach-----------------");
		 sportsCoach=ctx.getBean("footballCoach",SportsCoach.class);
		System.out.println("The timing is: "+sportsCoach.getTrainingSchedule());
		System.out.println("The Advice is: "+sportsCoach.getAdvice());
		
		
		
		

	}

}
