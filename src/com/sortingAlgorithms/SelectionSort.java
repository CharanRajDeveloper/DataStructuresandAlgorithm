package com.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
	public static int selectionSort(int[] a, int i, int n) {
		int min = a[i];
		int loc = i;
		for (int j = i + 1; j < n; j++) {
			if (min > a[j]) {
				min = a[j];
				loc = j;
			}
		}
		return loc;
	}

	public static void main(String[] args) {
		int a[] = { 4, 3, 9, 6 };
		System.out.println("Before Sorting:" + Arrays.toString(a));
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			int result = selectionSort(a, i, a.length);
			temp = a[result];
			a[result] = a[i];
			a[i] = temp;
		}
		System.out.println("After Sorting:" + Arrays.toString(a));

	}

}
