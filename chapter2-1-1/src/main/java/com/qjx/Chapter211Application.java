package com.qjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Chapter211Application {

    public static void main(String[] args) {


        SpringApplication.run(Chapter211Application.class, args);
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }



}
