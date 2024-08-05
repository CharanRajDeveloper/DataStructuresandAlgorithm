package com.logicalPrograms;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
	static int first = 0, second = 1, third = 0;

	public static void fiboRec(int length, int start) {
		third = first + second;
		if (start < length) {
			System.out.print(third + " ");
			first = second;
			second = third;
			fiboRec(length, (start + 1));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		System.out.print(first + " " + second + " ");
		fiboRec(n, 2);
	}
}
