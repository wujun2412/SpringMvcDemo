package com.wujun.spring.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wujun on 17/1/13.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        //ElConfig elConfig = context.getBean(ElConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(demoService.getProperties("book2.test"));
        //elConfig.outputResource();
        context.close();
    }
}
