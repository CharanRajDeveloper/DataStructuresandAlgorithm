package com.logicalPrograms;

public class FactorialUsingRecursion {
	static int result = 1;

	public static int findFactorial(int n) {
		if (n != 0) {
			result *= n;
			n--;
			findFactorial(n);
		}
		return result;
	}

	public static void main(String[] args) {
		int value = 6;
		System.out.println("Factorial of " + value + " is:" + findFactorial(value));
	}
}
