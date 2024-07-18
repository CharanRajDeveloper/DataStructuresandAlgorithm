package com.sortingAlgorithms;

public class CommonElementsbetween2arrays {
	public static void main(String[] args) {
		String a[] = { "a", "b", "c", "d", "e", "f" };
		String b[] = { "b", "d", "e", "h", "g", "c" };
		String c[] = new String[a.length + b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[k++] = a[i];
				}
			}
		}
		for (int j = 0; j < k; j++) {
			System.out.println(c[j]);
		}
	}

}
