package com.multithreading;

public class TestSynchronization {
	public static void main(String[] args) {
		Table t = new Table();
		BlockCheck bc=new BlockCheck();
		Thread1 t1 = new Thread1(t,bc);
		Thread2 t2 = new Thread2(t,bc);
		t1.start();
		t2.start();
	}

}
