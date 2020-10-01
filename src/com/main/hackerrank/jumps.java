package com.main.hackerrank;

public class jumps {

	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if ((i + 2) < c.length && c[i + 2] == 0) {
				jumps++;
				i = i + 1;
			} else {
				jumps++;
			}
		}
		return jumps;
	}

	public static void main(String[] args) {
		// int[] ar = { 0, 0, 1, 0, 0, 1, 0 };
		// int[] ar = { 0, 0, 0, 0, 1, 0 };
		int[] ar = { 0, 0, 0, 1, 0, 0 };
		System.out.println(jumpingOnClouds(ar));
	}

}
