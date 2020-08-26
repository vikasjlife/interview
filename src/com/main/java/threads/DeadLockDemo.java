package com.main.java.threads;

public class DeadLockDemo {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo2 t2 = new ThreadDemo2();
		t1.start();
		t2.start();
	}

	public static class ThreadDemo1 extends Thread {

		public void run() {
			synchronized (lock1) {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("Thread1 wating for lock2");

				synchronized (lock2) {
					System.out.println("Thread1 holding lock1 and lock2");
				}
			}
		}
	}

	public static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (lock2) {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("Thread2 waiting for lock1");
				synchronized (lock1) {
					System.out.println("Thread2 holding lock 2 and 1");
				}
			}
		}
	}

}
