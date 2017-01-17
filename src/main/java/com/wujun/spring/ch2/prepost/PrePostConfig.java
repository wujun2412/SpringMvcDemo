package com.wujun.spring.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wujun on 17/1/16.
 */
@Configuration
@ComponentScan("com.wujun.spring.ch2.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public BeanWayService getBeanWayService(){
        return new BeanWayService();
    }

    @Bean
    public Jsr250WayService getJsr250WayService(){
        return new Jsr250WayService();
    }

}
