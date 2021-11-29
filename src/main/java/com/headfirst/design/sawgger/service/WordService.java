package com.headfirst.design.sawgger.service;

import com.headfirst.design.sawgger.model.Table;

import java.util.List;

/**
 * @author LiuCan
 * @date 2021/11/29 9:40
 * @description WordService
 */
public interface WordService {

    List<Table> tableList(String jsonUrl);
}
