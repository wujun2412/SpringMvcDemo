package com.wujun.spring.ch1.javaconfig;

/**
 * Created by wujun on 17/1/11.
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}
