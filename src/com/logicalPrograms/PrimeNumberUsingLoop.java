package com.logicalPrograms;

import java.util.Scanner;

public class PrimeNumberUsingLoop {
	public static boolean isPrimeNumber(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;		
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (n == 0 || n == 1)
			System.out.println(n + " is not a even number");
		else {
			if (isPrimeNumber(n)) {
				System.out.println(n + " is a Prime Number");
			} else {
				System.out.println(n + " is not a Prime Number");
			}
		}
	}
}
