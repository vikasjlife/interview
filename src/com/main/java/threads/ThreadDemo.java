package com.main.java.threads;

public class ThreadDemo extends Thread {

	public void run() {
		System.out.println("T1 started");
	}

	public static void main(String[] args) {
		ThreadDemo th = new ThreadDemo();
		th.start();
	}
}
