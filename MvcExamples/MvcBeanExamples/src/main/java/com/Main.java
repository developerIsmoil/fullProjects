package com;

import com.model.Person;
import com.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /* 1. context.xml orqali bean qilish*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
//        Person bean1 = applicationContext.getBean(Person.class);
//        System.out.println(bean1.hashCode());
//
//        Person bean2 = (Person) applicationContext.getBean("person1");
//        System.out.println(bean2.hashCode());


        /* 2. annotation orqali bean qilish*/
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.scan("com.model");
        annotationConfigApplicationContext.refresh();

        User bean1 = annotationConfigApplicationContext.getBean(User.class);
        System.out.println(bean1);

//        User bean2 =(User) annotationConfigApplicationContext.getBean("user");
//        System.out.println(bean3);
    }
}
