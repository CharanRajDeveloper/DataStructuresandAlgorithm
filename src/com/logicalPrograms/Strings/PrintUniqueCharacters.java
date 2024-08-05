package com.logicalPrograms.Strings;

import java.util.ArrayList;
import java.util.List;

public class PrintUniqueCharacters {
	public static void main(String[] args) {
		String str = "Java Automation".replaceAll("\\s", "");
		List<Character> aList = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1 && !aList.contains(str.charAt(i))) {
				aList.add(str.charAt(i));
			}
		}
		System.out.println(aList);
	}
}
