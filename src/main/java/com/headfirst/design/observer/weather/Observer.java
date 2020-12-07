package com.headfirst.design.observer.weather;

import com.headfirst.design.observer.weather.dto.MeasurementsArgs;

/**
 * 观察者
 * @author LiuCan
 * @date 2020/12/5 21:17
 * @description Observer
 */
public interface Observer {

    /**
     * 更新
     * @author LiuCan
     * @date 2020/12/5 21:19
     * @param measurementsArgs
     * @return void
     */
    void update(MeasurementsArgs measurementsArgs);

}
