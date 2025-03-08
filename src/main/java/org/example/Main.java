package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
       // context.getBean(Teacher.class).init();

        container.getBean(Teacher.class).teach();

        container.registerShutdownHook(); // it will instruct jvm that if your closed then close the container aswell if it is not closed



    }
}