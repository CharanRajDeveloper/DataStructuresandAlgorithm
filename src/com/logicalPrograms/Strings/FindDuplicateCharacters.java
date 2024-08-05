package com.logicalPrograms.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		String str = "Learn Java Programming".replaceAll("\\s", "");
		System.out.println(str);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > 1 && !map.containsKey(str.charAt(i))) {
				System.out.println(str.charAt(i) + ":::" + count);
				map.put(str.charAt(i), count);
			}
		}

		for (Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " is repeated for:" + m.getValue());
		}

		List<Map.Entry<Character, Integer>> ml = new ArrayList<>(map.entrySet());
		Collections.sort(ml, (a, b) -> b.getValue().compareTo(a.getValue()));
		System.out.println(ml.get(1));
	}
}
