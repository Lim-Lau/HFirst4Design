package com.headfirst.design.observer.weather.impl;

import com.headfirst.design.observer.weather.DisplayElement;
import com.headfirst.design.observer.weather.Observer;
import com.headfirst.design.observer.weather.Subject;
import com.headfirst.design.observer.weather.dto.MeasurementsArgs;

/**
* @author LiuCan
* @date 2020/12/5 21:40
* @description CurrentConditionDisplay
*/
public class CurrentConditionDisplay implements Observer , DisplayElement {

    public Subject weatherData;

    public MeasurementsArgs measurementsArgs;

    public CurrentConditionDisplay(Subject weatherData) {
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
