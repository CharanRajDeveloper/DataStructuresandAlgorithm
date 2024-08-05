package com.logicalPrograms.Strings;

public class StringPalindromeUsingRecursion {
	public static String rev = "";

	public static String isPalindrome(String str, int length) {
		if (str.length() > 0) {
			rev += str.substring(str.length() - 1);
			isPalindrome(str.substring(0, str.length() - 1), str.length() - 1);
		}
		return rev;
	}

	public static void main(String[] args) {
		String str = "charan";
		System.out.println(isPalindrome(str, str.length()));
	}
}
