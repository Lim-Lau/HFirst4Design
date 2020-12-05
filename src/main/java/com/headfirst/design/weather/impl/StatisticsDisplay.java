package com.headfirst.design.weather.impl;

import com.headfirst.design.weather.DisplayElement;
import com.headfirst.design.weather.Observer;
import com.headfirst.design.weather.Subject;
import com.headfirst.design.weather.dto.MeasurementsArgs;

/**
* @author LiuCan
* @date 2020/12/5 21:40
* @description StatisticsDisplay
*/
public class StatisticsDisplay implements Observer , DisplayElement {

    public Subject weatherData;

    public MeasurementsArgs measurementsArgs;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions:%s F degrees and %s humidity", measurementsArgs.getTemperature(), measurementsArgs.getHumidity()));
    }

    @Override
    public void update(MeasurementsArgs measurementsArgs) {
        this.measurementsArgs = measurementsArgs;
        display();

    }
}
