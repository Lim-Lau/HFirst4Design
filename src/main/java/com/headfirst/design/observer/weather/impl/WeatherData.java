package com.headfirst.design.observer.weather.impl;

import com.headfirst.design.observer.weather.Observer;
import com.headfirst.design.observer.weather.Subject;
import com.headfirst.design.observer.weather.dto.MeasurementsArgs;

import java.util.ArrayList;

/**
 * @author LiuCan
 * @date 2020/12/5 21:28
 * @description WeatherData
 */
public class WeatherData implements Subject {

    private  ArrayList observers;

    private MeasurementsArgs measurementsArgs;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Object o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Object o) {
        if (observers.indexOf(o) >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++
        ) {
            Observer observer = (Observer) observers.get(i);
            observer.update(measurementsArgs);
        }

    }

    /**
     * @author LiuCan
     * @date 2020/12/5 21:35
     * @param
     * @return void
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     * 用于模拟观测参数改变之后的调用
     * @author LiuCan
     * @date 2020/12/5 21:35
     * @param measurementsArgs
     * @return void
     */
    public void setMeasurementsArgs(MeasurementsArgs measurementsArgs) {
        this.measurementsArgs = measurementsArgs;
        measurementsChanged();
    }
}
