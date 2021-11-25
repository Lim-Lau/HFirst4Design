package com.headfirst.design.observer.j;

import com.headfirst.design.observer.weather.dto.MeasurementsArgs;

/**
 * @author LiuCan
 * @date 2020/12/12 17:56
 * @description CurrentConditionsDisplayTest
 */
public class CurrentConditionsDisplayTest {

    public static void main(String[] args) {
        WeatherData4J weatherData = new WeatherData4J();

        CurrentConditionsDisplay currentConditionDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurementsArgs(new MeasurementsArgs(80, 65, 34.4f));
        weatherData.setMeasurementsArgs(new MeasurementsArgs(82, 70, 29.2f));

    }

}
