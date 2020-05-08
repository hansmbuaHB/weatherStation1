package com.company;

public class Main {

    public static void main(String[] args) {
	 WeatherDate weatherDate = new WeatherDate();
	 CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDate);
//	 StatisticDisplay statisticDisplay = new StatistcDisplay();
//	 ForecastDisplay forecastDisplay = new ForecastDisplay();
	 weatherDate.setMeasurements(80,65,30.f);
	 weatherDate.setMeasurements(82,70,29.2f);
	 weatherDate.setMeasurements(78,90,29.2f);



    }
}
