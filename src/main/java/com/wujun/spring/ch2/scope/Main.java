package com.wujun.spring.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wujun on 17/1/12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);
        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);

        System.out.println(prototypeService1==prototypeService2);
        System.out.println(singletonService1==singletonService2);

        context.close();

    }

}
