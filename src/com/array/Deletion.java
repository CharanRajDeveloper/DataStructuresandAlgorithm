package com.array;

import java.util.Arrays;

public class Deletion {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int pos = 2;
		for (int i = pos - 1; i < a.length-1; i++) {
			a[i] = a[i + 1];
		}
		for(int i=0;i<4;i++) {
			System.out.println(a[i]);
		}
		//System.out.println("After deletion:" + Arrays.toString(a));
	}
}
