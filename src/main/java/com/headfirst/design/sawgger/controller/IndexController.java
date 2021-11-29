package com.headfirst.design.sawgger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LiuCan
 * @date 2021/11/29 9:38
 * @description IndexController
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        return "index";
    }
}
