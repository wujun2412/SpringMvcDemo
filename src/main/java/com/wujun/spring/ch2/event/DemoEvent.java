package com.wujun.spring.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * 自定义事件
 * Created by wujun on 17/1/17.
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg= msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
