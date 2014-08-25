package com.theRed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.theRed.classes.HelloWorld;
import com.theRed.classes.SuperHelloWorld;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		SuperHelloWorld superHelloWorld = (SuperHelloWorld) context.getBean("superHelloWorld");
		helloWorld.getMessage();
		superHelloWorld.printMessage();
	}

}
