package com.designPatterns.FactoryDesign;

public class GetPlanFactory {

	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		} else if (planType.equalsIgnoreCase("DP")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("CP")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("IP")) {
			return new InsitutionalPlan();
		}
		return null;
	}

}
