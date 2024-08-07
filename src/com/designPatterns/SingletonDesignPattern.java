package com.designPatterns;

class singletonExample {
	private static singletonExample seinstance = null;

	private singletonExample() {
	}

	public static void factoryMethod() {
		if (seinstance == null) {
			seinstance = new singletonExample();
			System.out.println("Object Created:" + seinstance);
		} else {
			System.out.println("Only once object will be created..");
		}
	}
}

public class SingletonDesignPattern {
	public static void main(String[] args) {
		singletonExample.factoryMethod();
		singletonExample.factoryMethod();
	}
}
