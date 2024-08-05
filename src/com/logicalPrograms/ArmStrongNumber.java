package com.logicalPrograms;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int n = 151;
		int temp = n;
		int digits = 0;
		while (temp != 0) {
			temp = temp / 10;
			digits++;
		}
		System.out.println("Number of digits:" + digits);
		int result = 0;
		int rem = 0;
		temp = n;
		while (temp != 0) {
			rem = temp % 10;
			result += Math.pow(rem, digits);
			temp=temp/10;
		}
		if (n == result) {
			System.out.println("It is Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
