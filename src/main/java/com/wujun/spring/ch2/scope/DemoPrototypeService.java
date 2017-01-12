package com.wujun.spring.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by wujun on 17/1/12.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
