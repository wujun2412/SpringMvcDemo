package com.wujun.spring.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wujun on 17/1/11.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        FunctionService functionService=context.getBean(FunctionService.class);
        System.out.println(functionService.sayHello("wujun"));
        context.close();
    }
}
