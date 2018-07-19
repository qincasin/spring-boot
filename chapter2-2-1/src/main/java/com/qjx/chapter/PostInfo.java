package com.qjx.chapter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author casin
 * @date 2018-07-19 15:30
 **/
@Data
@ConfigurationProperties(prefix = "com.qjx.posts")
public class PostInfo {
    private String title;
    private String content;

}
