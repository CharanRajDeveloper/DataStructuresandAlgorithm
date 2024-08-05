package com.logicalPrograms;

public class PrimeNumberUsingRecursion {
	static boolean retval = true;

	public static boolean isPrimeNumber(int n, int start) {
		int limit = n / 2;
		if (start != limit) {
			if (n % start == 0)
				retval = false;
			else
				isPrimeNumber(n, (start + 1));
		}
		return retval;
	}

	public static void main(String[] args) {
		int n = 72;
		if (isPrimeNumber(n, 2))
			System.out.println(n + " is a Prime Number");
		else {
			System.out.println(n + " is not a Prime Number");
		}
	}

}
