package com;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;

/**
 * Created by Nirav on 27-02-2016.
 */
public class BeanCounter implements BeanPostProcessor {
    private List<Object> beanObjectList;

    public List<Object> getBeanObjectList() {
        return beanObjectList;
    }

    public void setBeanObjectList(List<Object> beanObjectList) {
        this.beanObjectList = beanObjectList;
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Before Initializing bean: " + s );
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if(this.getBeanObjectList() != null)
            this.getBeanObjectList().add(o) ;
        System.out.println("After Initializing bean: " + s );
        System.out.println("Bean instance counter: "+ this.getBeanObjectList().size()) ;
        return o;
    }
}
