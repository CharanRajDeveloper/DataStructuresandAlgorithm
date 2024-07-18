package com.sortingAlgorithms;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int a[] = { 19, 21, 13, 4, 15 };
		int b[] = { 6, 17, 84, 91, 4 };
		int ma[] = new int[a.length + b.length];
		System.out.println("Array a data:" + Arrays.toString(a));
		System.out.println("Array b data:" + Arrays.toString(b));
		// Business Logic
		int i = 0;
		for (int aa : a) {
			ma[i] = aa;
			i++;
		}
		for (int ba : b) {
			ma[i] = ba;
			i++;
		}
		// Using Predefined functions
		System.arraycopy(a, 0, ma, 0, a.length);
		System.arraycopy(b, 0, ma, a.length, b.length);
		System.out.println("Array merge data:" + Arrays.toString(ma));
	}

}
