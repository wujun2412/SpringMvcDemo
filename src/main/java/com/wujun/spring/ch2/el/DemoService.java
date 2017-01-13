package com.wujun.spring.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by wujun on 17/1/13.
 */
@Service
public class DemoService {
    @Value("其他类的属性2")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
