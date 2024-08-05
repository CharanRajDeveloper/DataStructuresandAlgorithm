package com.logicalPrograms.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CharacterCountOfEachCharacter {
	public static void main(String[] args) {
		String str = "Test Automation Java Automation";
		String[] strarry = str.split(" ");
		Map<String, Integer> sm = new HashMap<String, Integer>();
		for (int i = 0; i < strarry.length; i++) {
			int count = 1;
			for (int j = i + 1; j < strarry.length; j++) {
				if (strarry[i].equals(strarry[j])) {
					count++;
				}
			}
			if (count > 0 && !sm.containsKey(strarry[i])) {
				sm.put(strarry[i], count);
			}
		}
		
		for (Entry<String, Integer> s : sm.entrySet()) {
			System.out.println(s.getKey() + ":::" + s.getValue()+"::"+sm.get(sm));
		}
		
		System.out.println("**********Using Collections************");
		TreeMap<String, Integer> tm=new TreeMap<String,Integer>();
		
		for(String i:strarry) {
			if(tm.containsKey(i)) {
				tm.put(i, tm.get(i)+1);
			}else {
				tm.put(i, 1);
			}
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&");
		for (Entry<String, Integer> s : tm.entrySet()) {
			System.out.println(s.getKey() + ":::" + s.getValue()+"::"+sm.get(sm));
		}
		
	}
}
