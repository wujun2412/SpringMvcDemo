package com.wujun.spring.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by wujun on 17/1/13.
 */
@Configuration
@ComponentScan("com.wujun.spring.ch2.el")
@PropertySource({"classpath:test.properties","classpath:test2.properties"})
public class ElConfig {
    @Value("I Love you!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{demoService.author}")
    private String fromAuthor;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Value("${book2.name}")
    private String bookName2;

    @Autowired
    private Environment environment;

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return  new PropertySourcesPlaceholderConfigurer();
    }*/

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(fromAuthor);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
            System.out.println(bookName2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
