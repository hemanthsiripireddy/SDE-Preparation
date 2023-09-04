package com.hemanth.springDemo;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvice implements ExpertAdvice{

	@Override
	public String getExpertAdvice() {
		// TODO Auto-generated method stub
		return "Do Practice atleast  4hr a day";
	}

}
