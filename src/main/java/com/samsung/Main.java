package com.samsung;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.samsung.service.DemoService;
import com.samsung.service.QuestionService;



public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        new DemoService(context.getBean(QuestionService.class)).demo();
    }
}
