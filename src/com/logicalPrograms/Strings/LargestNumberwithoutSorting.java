package com.logicalPrograms.Strings;

public class LargestNumberwithoutSorting {
	public static void main(String[] args) {
		int[] a = { 89, 87, 56, 34, 92, 100, 110, 65 };
		int max1 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max1 = a[i];
			}
		}

		System.out.println("First Highest Number:" + max1);
		int max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < max1 && a[i] > max2) {
				max2 = a[i];
			}
		}
		System.out.println("Second Highest Number:" + max2);
		int max3 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < max1 && a[i] < max2 && a[i] > max3) {
				max3 = a[i];
			}
		}
		System.out.println("Third Highest Number:" + max3);
	}
}
