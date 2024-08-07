package com.designPatterns.BuilderDesign;

public class Shop {
	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setOs("Windows").setRam(4).getPhone();
		System.out.println(phone);
	}

}
