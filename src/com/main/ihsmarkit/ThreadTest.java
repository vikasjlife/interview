package com.main.ihsmarkit;

public class ThreadTest {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("T1");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("T2");
			}
		};

		t1.start();
		t2.start();
		System.out.println("END");

	}

}
