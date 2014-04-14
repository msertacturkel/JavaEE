package com.yourcompany.struts;

public class DailyForecast {
	public DailyForecast(String day, int chanceOfPrecip) {
		this.day = day;
		this.chancePrecip = chanceOfPrecip;
	}

	public int getChancePrecip() {
		return chancePrecip;
	}

	public void setChancePrecip(int chancePrecip) {
		this.chancePrecip = chancePrecip;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	private String day;
	private int chancePrecip;

}
