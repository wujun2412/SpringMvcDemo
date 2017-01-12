package com.wujun.spring.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by wujun on 17/1/10.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService functionService = context.getBean(UseFunctionService.class);
        FunctionService functionService2 = context.getBean(FunctionServiceImpl.class);
        System.out.println(functionService.sayHello("world"));
        System.out.println(functionService2.sayHello("wujun"));
        context.close();
    }
}
