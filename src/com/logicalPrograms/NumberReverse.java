package com.logicalPrograms;

public class NumberReverse {
	public static void main(String[] args) {
		int original = 12345, rev = 0;

		System.out.println("****************Using Integer***************");
		while (original != 0) {
			int rem = original % 10;
			rev = (rev * 10) + rem;
			original = original / 10;
		}
		System.out.println("Result:" + rev);

		System.out.println("****************Using Strings***************");
		int i1=3421;
		String so = Integer.toString(i1);
		String revString = "";
		for (int i = so.length() - 1; i >= 0; i--) {
			revString = revString + so.charAt(i);
		}
		System.out.println("Reverse Number:" + revString);
	}
}
