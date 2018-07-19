package com.qjx;

import com.qjx.service.BlogProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter211ApplicationTests {
    @Resource
    private BlogProperty blogProperty;

    @Test
    public void contextLoads() {
    }


    @Test
    public void test(){
        System.out.println(blogProperty.getName());
        String result = blogProperty.toString();
        System.out.println("result结果："+result);
    }

}
