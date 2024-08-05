package com.logicalPrograms.Strings;

import java.util.Arrays;

public class AnagramsCheck {
	public static void main(String[] args) {
		String str = "dcba";
		char temp;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - i - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		System.out.println("After Sorting:" + Arrays.toString(ch));

		String str1 = "silent";
		String str2 = "listenk";
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not a anagram");
		}
	}
}
