package com.sortingAlgorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NoofOccurence {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 1, 2, 3 };
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		int count = 0;
		for (int i : a) {
			if (tm.containsKey(i)) {
				tm.put(i, tm.get(i)+1);
			} else {
				tm.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> i : tm.entrySet()) {
			System.out.println(i.getKey() + " is repeated for:" + i.getValue());
		}
		System.out.println("********************");
		Map<Integer,Character> hm=new HashMap<Integer,Character>();
	     hm.put(2,'F');
	     hm.put(3,'e');
	     System.out.println(hm.get(3));
	}

}
