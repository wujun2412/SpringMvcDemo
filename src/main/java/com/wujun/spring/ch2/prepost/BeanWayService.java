package com.wujun.spring.ch2.prepost;

/**
 * Created by wujun on 17/1/16.
 */
public class BeanWayService {

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数——BeanWayService");
    }

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public  void destroy(){
        System.out.println("@Bean-destroy-method");
    }

}
