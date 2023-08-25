package com.hemanth.springDemo;

public class CricketCoach implements SportsCoach{
	private ExpertAdvice expertAdvice;
	
	public CricketCoach(ExpertAdvice expertAdvice) {
		this.expertAdvice=expertAdvice;
	}

	@Override
	public String getTrainingSchedule() {
		// TODO Auto-generated method stub
		return "Do Practice at 6am";
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getExpertAdvice();
	}

}
