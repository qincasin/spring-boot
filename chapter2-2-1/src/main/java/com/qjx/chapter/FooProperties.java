package com.qjx.chapter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件获取
 *
 * @author casin
 * @date 2018-07-19 15:25
 **/
@Data
@ConfigurationProperties(prefix = "com.qjx")
public class FooProperties {
    private String foo;
    private String databasePlatform;
}
