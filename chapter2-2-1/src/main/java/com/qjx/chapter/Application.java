package com.qjx.chapter;

import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        Binder binder = Binder.get(context.getEnvironment());
        //绑定简单配置
        FooProperties foo = binder.bind("com.qjx",Bindable.of(FooProperties.class)).get();
        System.out.println(foo.getFoo());
        System.out.println(foo.toString());

        //绑定list配置
        List<String> post = binder.bind("com.qjx.post",Bindable.listOf(String.class)).get();
        System.out.println("post:"+post);

        List<PostInfo> posts = binder.bind("com.qjx.posts",Bindable.listOf(PostInfo.class)).get();
        System.out.println("posts:"+posts);

        //读取配置
        System.out.println(context.getEnvironment().getProperty("com.qjx.foo"));
        System.out.println(context.getEnvironment().containsProperty("com.qjx.database-platform")); //true
        System.out.println(context.getEnvironment().containsProperty("com.qjx.databasePlatform")); //false

    }
}
