package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by p12se on 29.06.15.
 */
public class Main {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
//
//        Performer performer = (Performer) context.getBean("poeticDuke");
//        performer.perform();
        Volunteer volunteer = (Volunteer) context.getBean("volunteer");
        volunteer.thinkOfSomething("BIg burger");


    }
}
