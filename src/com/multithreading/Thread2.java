package com.multithreading;

public class Thread2 extends Thread {
	Table t;
	BlockCheck bc;

	public Thread2(Table t, BlockCheck bc) {
		this.t = t;
		this.bc = bc;
	}

	@Override
	public void run() {
		// t.printTable(100);
		bc.printBlock(100);
	}

}
