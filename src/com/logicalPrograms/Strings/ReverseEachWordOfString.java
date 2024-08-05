package com.logicalPrograms.Strings;

public class ReverseEachWordOfString {
	public static void main(String[] args) {
		String str = "Java is good programming langauges";
		String[] strarr = str.split(" ");
		System.out.println(str);
		for (int i = 0; i < strarr.length; i++) {
			String word = strarr[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}

	}
}
