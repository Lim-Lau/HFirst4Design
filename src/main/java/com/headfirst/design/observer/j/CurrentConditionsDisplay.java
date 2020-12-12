package com.headfirst.design.observer.j;

import com.headfirst.design.observer.weather.DisplayElement;
import com.headfirst.design.observer.weather.dto.MeasurementsArgs;

import java.util.Observable;
import java.util.Observer;

/**
 * @author LiuCan
 * @date 2020/12/12 17:49
 * @description CurrentConditionsDisplay
 */
public class CurrentConditionsDisplay implements Observer , DisplayElement {

    Observable observable;

    MeasurementsArgs measurementsArgs;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions:%s F degrees and %s humidity", measurementsArgs.getTemperature(), measurementsArgs.getHumidity()));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData4J) {
            WeatherData4J weatherData4J = (WeatherData4J) o;
            measurementsArgs = weatherData4J.getMeasurementsArgs();
            display();
        }

    }
}
