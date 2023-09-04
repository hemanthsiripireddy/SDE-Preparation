package com.hemanth.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hemanth.springDemo.CricketCoach;
import com.hemanth.springDemo.ExpertAdvice;
import com.hemanth.springDemo.FootballCoach;
import com.hemanth.springDemo.PracticeAdvice;
import com.hemanth.springDemo.SportsCoach;


@Configuration
@ComponentScan("com.hemanth.springDemo")
public class SpringConfig {
	@Bean
	public ExpertAdvice practiceAdvice() {
		return new PracticeAdvice();
		
	}
	@Bean
	public SportsCoach cricketCoach() {
		return new CricketCoach(practiceAdvice());
	}
	@Bean
	public SportsCoach footballCoach() {
		return new FootballCoach();
	}

}
