package com.yourcompany.struts;

import java.util.ArrayList;
import java.util.List;

public class WeeklyWeather {
	public WeeklyWeather() {
		weekForecast = new ArrayList();
		weekForecast.add(new DailyForecast("Sunday", 70));
		weekForecast.add(new DailyForecast("Monday", 40));
		weekForecast.add(new DailyForecast("Tuesday", 20));
		weekForecast.add(new DailyForecast("Wednesday", 5));
		weekForecast.add(new DailyForecast("Thursday", 50));
		weekForecast.add(new DailyForecast("Friday", 40));
		weekForecast.add(new DailyForecast("Saturday", 90));
	}

	public List getWeekForecast() {
		return weekForecast;
	}

	private List weekForecast;

}
