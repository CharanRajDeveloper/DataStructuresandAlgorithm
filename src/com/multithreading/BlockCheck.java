package com.multithreading;

public class BlockCheck {
	
	public void printBlock(int n) {
		synchronized (Thread1.class) { 
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

}
