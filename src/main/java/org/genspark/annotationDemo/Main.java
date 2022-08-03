package org.genspark.annotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringAnno.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAdd());
        System.out.println(student.getPh());
    }
}
