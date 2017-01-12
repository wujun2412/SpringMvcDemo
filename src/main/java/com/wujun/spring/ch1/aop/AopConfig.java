package com.wujun.spring.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wujun on 17/1/11.
 */
@Configuration
@ComponentScan("com.wujun.spring.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
