package com.headfirst.design.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuCan
 * @date 2020/12/2 11:25
 * @description UserController
 */
@RestController
@Api(tags = {"用户管理"}, value = "用户管理")
public class UserController {
    @GetMapping("/list")
    @ApiOperation(value = "用户列表")
    public void list() {
    }
}
