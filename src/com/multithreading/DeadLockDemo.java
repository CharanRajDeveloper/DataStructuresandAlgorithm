package com.multithreading;

class Demo1 {
	public  void demo1fun(Demo2 d2) {
		System.out.println("Demo1 class demo1fun()");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Demo1 trying to call Demo2 last()");
		d2.last();
	}

	public synchronized void last() {
		System.out.println("This is the last method() of Demo1 class...");
	}
}

class Demo2 {
	public synchronized void demo2fun(Demo1 d1) {
		System.out.println("Demo2 class demo2fun()");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Demo2 trying to call Demo1 last()");
		d1.last();

	}

	public synchronized void last() {
		System.out.println("This is the last method() of Demo2 class...");
	}
}

public class DeadLockDemo extends Thread {
	Demo1 d1 = new Demo1();
	Demo2 d2 = new Demo2();

	DeadLockDemo() {
		Thread t = new Thread(this);
		t.start();
		d2.demo2fun(d1);
	}

	public void run() {
		d1.demo1fun(d2);
	}

	public static void main(String[] args) {
		DeadLockDemo dl = new DeadLockDemo();

	}

}
