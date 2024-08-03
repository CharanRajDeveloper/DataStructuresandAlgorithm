package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements you want to enter in the array");
			int n = sc.nextInt();
			System.out.println("Enter the array elements");
			int[] a = new int[n + 1];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("Enter the value to be inserted");
			int value = sc.nextInt();
			System.out.println("Enter the position to be inserted");
			int pos = sc.nextInt();
			if (pos > n) {
				System.out.println("Insertion Not Possible");
				throw new IllegalArgumentException("Position should be within the array size not beyond that");
			}
			System.out.println("Before Insertion:" + Arrays.toString(a));
			for (int i = n - 1; i >= pos - 1; i--) {
				a[i + 1] = a[i];
			}
			a[pos - 1] = value;
			System.out.println("After insertion:" + Arrays.toString(a));
		} catch (IllegalArgumentException e) {
			throw new RuntimeException("Incorrect Position", e);
		}
	}
}
