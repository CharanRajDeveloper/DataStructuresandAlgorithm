package com.searchingAlgorithms;

public class LinearSearch {
	public static int linearSearch(int[] a, int val) {
		int i = 0;
		while (i < a.length) {
			if (a[i] == val)
				return i;
			else
				i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 55, 29, 10, 40, 57, 41, 20, 24, 45 };
		int val = 10;
		int result = linearSearch(a, val);
		if (result == -1)
			System.out.println(val + " is not found in the array..");
		else
			System.out.println(val + " is found at index:" + result + " in the array..");

	}

}
