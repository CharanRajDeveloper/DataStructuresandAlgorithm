package com.sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = { 12, 15, 3, 7, 8, 4, 2 };
		System.out.println("Before Sorting:" + Arrays.toString(a));
		insertion_Sort(a);
		System.out.println("After Sorting:" + Arrays.toString(a));
	}

	private static void insertion_Sort(int[] a) {
		int stval = 0, j;
		for (int start = 1; start < a.length; start++) {
			stval = a[start];
			for (j = start - 1; j >= 0 && stval < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = stval;
		}

	}

}
