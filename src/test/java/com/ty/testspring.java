package com.ty;

import com.ty.service.accountservice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testspring {
    @Test
    public void findall(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        accountservice as = (accountservice) ac.getBean("accountservice");
        as.findall();
    }
}
