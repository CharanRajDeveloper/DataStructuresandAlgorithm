package com.multithreading;

public class Table {
	public synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
