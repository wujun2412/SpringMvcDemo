package com.wujun.spring.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by wujun on 17/1/16.
 */
public class Jsr250WayService {

    public Jsr250WayService() {
        super();
        System.out.println("初始化构造函数——Jsr250WayService");
    }

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
