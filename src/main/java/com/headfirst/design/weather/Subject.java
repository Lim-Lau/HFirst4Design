package com.headfirst.design.weather;

/**
 * 主题
 * @author LiuCan
 * @date 2020/12/5 21:15
 * @description Subject
 */
public interface Subject {

    /**
     * 注册观察者
     * @author LiuCan
     * @date 2020/12/5 21:16
     * @param o
     * @return void
     */
    public void registerObserver(Object o);

    /**
     * 删除观察者
     * @author LiuCan
     * @date 2020/12/5 21:16
     * @param o
     * @return void
     */
    void removeObserver(Object o);

    /**
     * 通知观察者
     * @author LiuCan
     * @date 2020/12/5 21:16
     * @return void
     */
    void notifyObserver();
}
