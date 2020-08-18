package com.ccoder;

public class BaseBallCoach implements Coach {

	Fortune fortune;
	
	public BaseBallCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortuneService() {
		return fortune.getFortune();
	}

}
