package com.headfirst.design.observer.weather.dto;

/**
 * 观测参数
 * @author LiuCan
 * @date 2020/12/5 21:25
 * @description MeasurementsArgs
 */
public class MeasurementsArgs {

    private float temperature;

    private float humidity;

    private float pressure;

    public MeasurementsArgs() {
    }

    public MeasurementsArgs(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
