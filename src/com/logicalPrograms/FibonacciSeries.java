package com.logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int first = 0, second = 1, third = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();
		System.out.print(first + " " + second + " ");
		for (int i = 0; i < n; i++) {
			third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}
	}
}
