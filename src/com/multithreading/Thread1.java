package com.multithreading;

public class Thread1 extends Thread {
	Table t;
	BlockCheck bc;

	public Thread1(Table t, BlockCheck bc) {
		this.t = t;
		this.bc = bc;
	}

	@Override
	public void run() {
		//t.printTable(5);
		bc.printBlock(5);
	}

}
