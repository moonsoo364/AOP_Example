package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AopExampleApplication {

	public static void main(String[] args) {
        SpringApplication.run(AopExampleApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SampleAdder sampleAdder = (SampleAdder) context.getBean("sampleAdder");
        sampleAdder.add(1, 2);
	}
}
