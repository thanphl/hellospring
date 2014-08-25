package com.theRed.classes;

public class SuperHelloWorld {
	private HelloWorld helloWorld;

	public SuperHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}

	public void printMessage() {
		this.helloWorld.getMessage();
		System.out.println("Hello from super helloworld");
	}
}
