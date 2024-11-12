package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args){
    	ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml");
        JavaTrainer j = (JavaTrainer) cpx.getBean("java");
        System.out.println("Java Trainer: "+j.getName());
        
        SQLTrainer s = (SQLTrainer) cpx.getBean("sql");
        System.out.println("SQL Trainer: "+s.getName());
        
        WebTrainer w = (WebTrainer) cpx.getBean("web");
        System.out.println("Web Trainer: "+w.getName());

    }
}
