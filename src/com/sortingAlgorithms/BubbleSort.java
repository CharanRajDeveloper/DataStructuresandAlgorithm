package com.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
	public static int[] bubbleSort(int[] a) {
		int temp = 0;
		//Business logic
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = { 35, 10, 31, 11, 26 };
		System.out.println("Before Sorting..");
		System.out.println(Arrays.toString(a));
		System.out.println("After Sorting..");
		System.out.println(Arrays.toString(bubbleSort(a)));
		// Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
