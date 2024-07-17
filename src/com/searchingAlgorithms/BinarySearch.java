package com.searchingAlgorithms;

public class BinarySearch {
	public static int binarySearch(int[] a, int beg, int end, int val) {
		int mid = 0;
		if (end >= beg) {
			mid = (beg + end) / 2;
			if (val == a[mid]) {
				return mid;
			}
			if (val > a[mid]) {
				return binarySearch(a, mid + 1, end, val);
			} else {
				return binarySearch(a, beg, mid - 1, val);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 12,34,34,56};
		int val = 56;
		int result = binarySearch(a, 0, a.length - 1, val);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println(val + " found at:" + result + " index");
		}

	}
}
