package com.designPatterns.FactoryDesign;

import java.util.Scanner;

public class GenerateBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Plan");
		String plan = sc.next();
		System.out.println("Enter the number of units");
		int units = sc.nextInt();
		Plan gPlanFactory = new GetPlanFactory().getPlan(plan);
		gPlanFactory.getRate();
		gPlanFactory.calculateBill(units);
		sc.close();
	}
}
