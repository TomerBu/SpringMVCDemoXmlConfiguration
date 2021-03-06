package edu.tomerbu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //load the spring configuration file:
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        //retrieve the bean from spring container:

        //call methods on the bean:
        System.out.println(theCoach.getDailyWorkout());

        //cleanup:
        context.close();


    }

}
