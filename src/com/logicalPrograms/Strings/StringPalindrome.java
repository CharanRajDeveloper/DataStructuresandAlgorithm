package com.logicalPrograms.Strings;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		if (str.equalsIgnoreCase(result)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Non-Palindrome");
		}

	}
}
