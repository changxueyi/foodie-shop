package com.cxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/5/13 18:11
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object heallo() {
        return "hello world";
    }
}