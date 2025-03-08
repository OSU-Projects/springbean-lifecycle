package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
/**
 * Priority of Initializing bean
 * 1. Java annotation based - @PostConstruct
 * 2. Implements Initializingbean   - afterPropertySet();
 * 3. Config file - @Bean(initMethod = "anotherinit()")public Teacher{
 *
 *                      };
 *
 * */
@Component
public class Teacher implements InitializingBean {
    private List<String> subjects;


    @PostConstruct
    public void init(){
        System.out.println(" called by post construct ");
        subjects = new ArrayList<>();
        subjects.add("DS");
        subjects.add("biology");
    }

    public  void anotherInit(){
        System.out.println("another init method called----");
    }
    public Teacher(){
        System.out.println("teacher is initialized...");
    }

    public void teach(){
        System.out.println("teacher method is called..:)");
        for(String subject : subjects){
            System.out.println(" -> "+subject);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" After property set method is called.....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("  Destroy method called ------------------ ");
    }
}
