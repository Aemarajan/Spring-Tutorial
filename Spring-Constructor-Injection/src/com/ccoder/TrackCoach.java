package com.ccoder;

public class TrackCoach implements Coach {

	Fortune fortune;
	
	public TrackCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "5km running practice";
	}

	@Override
	public String getFortuneService() {
		return fortune.getFortune();
	}

}
