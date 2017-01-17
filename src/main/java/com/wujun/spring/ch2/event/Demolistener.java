package com.wujun.spring.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * Created by wujun on 17/1/17.
 */
@Component
public class Demolistener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("demo_listener接收到了demo_publisher发布的消息:"+msg);
    }
}
