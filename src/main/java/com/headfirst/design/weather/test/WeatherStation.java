package com.headfirst.design.weather.test;

import com.headfirst.design.weather.dto.MeasurementsArgs;
import com.headfirst.design.weather.impl.CurrentConditionDisplay;
import com.headfirst.design.weather.impl.WeatherData;

/**
 * @author LiuCan
 * @date 2020/12/5 22:13
 * @description WeatherStation
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurementsArgs(new MeasurementsArgs(80, 65, 34.4f));
        weatherData.setMeasurementsArgs(new MeasurementsArgs(82, 70, 29.2f));
        weatherData.setMeasurementsArgs(new MeasurementsArgs(78, 90, 34.4f));
    }
}
