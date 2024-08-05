package com.logicalPrograms;

public class NumberPalindrome {
	public static void main(String[] args) {
		int original = 111, rev = 0, temp = original, rem = 0;
		while (temp != 0) {
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}
		System.out.println("Reverse Number is:" + rev);
		if (original == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
