package com.wujun.spring.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by wujun on 17/1/10.
 */
@Service
public class FunctionService {

    public String sayHello(String word){
        return "Hello "+word+" !";
    }

}
