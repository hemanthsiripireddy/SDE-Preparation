package com.hemanth.springDemo;

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

	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}
	

}
