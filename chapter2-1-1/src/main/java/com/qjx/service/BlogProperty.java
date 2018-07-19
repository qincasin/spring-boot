package com.qjx.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author casin
 * @date 2018-07-06 18:11
 **/
@Component
@Data
public class BlogProperty {

    @Value("${com.qjx.blog.name}")
    private String name;
    @Value("${com.qjx.blog.title}")
    private String title;
    @Value("${com.qjx.blog.desc}")
    private String desc;
    @Value("${com.qjx.blog.value}")
    private String value;

    @Value("${com.qjx.blog.number}")
    private String number;
    @Value("${com.qjx.blog.bignumber}")
    private String bignumber;
    @Value("${com.qjx.blog.test1}")
    private String test1;
    @Value("${com.qjx.blog.test2}")
    private String test2;



}
