package com.gwj.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Aware implements ApplicationContextAware {
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
