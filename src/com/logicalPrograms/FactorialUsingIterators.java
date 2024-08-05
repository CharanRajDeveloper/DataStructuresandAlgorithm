package com.logicalPrograms;

public class FactorialUsingIterators {
	public static void main(String[] args) {
		int n = 4;
		int temp = n;
		int result = 1;
		while (n != 0) {
			result = result * n;
			n--;
		}
		System.out.println("Factorial of " + temp + " is:" + result);
	}
}
