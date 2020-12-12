package com.headfirst.design.observer.j;

import com.headfirst.design.observer.weather.dto.MeasurementsArgs;

import java.util.Observable;

public class WeatherData4J extends Observable {

    private MeasurementsArgs measurementsArgs;

    public WeatherData4J() {
    }

    public void measurementsChange() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurementsArgs(MeasurementsArgs measurementsArgs) {
        this.measurementsArgs = measurementsArgs;
        measurementsChange();
    }

    public MeasurementsArgs getMeasurementsArgs() {
        return measurementsArgs;
    }
}
