package com.logicalPrograms;

public class SumofDigits {
	public static void main(String[] args) {
		int n = 1234, sum = 0, rem=0;
		System.out.println("Entered Number is:" + n);
		while (n != 0) {
			rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		System.out.println("Sum of digits:" + sum);
	}
}
