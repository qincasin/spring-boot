package com.qjx.chapter1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author casin
 * @create 2018-07-06 17:22
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }
}
