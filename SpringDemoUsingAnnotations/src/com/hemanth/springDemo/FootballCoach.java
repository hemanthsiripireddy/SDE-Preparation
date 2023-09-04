package com.hemanth.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements SportsCoach{
	ExpertAdvice expertAdvice;

	@Override
	public String getTrainingSchedule() {
		// TODO Auto-generated method stub
		return "Practice time is at 8 am";
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getExpertAdvice();
	}

	public ExpertAdvice getExpertAdvice() {
		return expertAdvice;
	}
@Autowired
	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}
	

}
