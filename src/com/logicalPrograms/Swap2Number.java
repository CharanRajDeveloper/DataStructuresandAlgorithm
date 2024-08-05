package com.logicalPrograms;

public class Swap2Number {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before Swapping:" + a + ":" + b);
		a = a + b; // 30
		b = a - b; // 30-20=10
		a = a - b; // 30-20 =20
		System.out.println("After Swapping:" + a + ":" + b);
	}
}
