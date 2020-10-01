package com.main.hackerrank;

public class Equal {

	static int maxCount(int[] ar) {
		int min = Integer.MAX_VALUE;
		int n = ar.length;
		for (int i = 0; i < n; i++) {
			min = Math.min(min, ar[i]);
		}
		int br = Integer.MAX_VALUE / 2;
		for (int bl = min; bl >= 0; bl--) {
			int result = 0;
			for (int i = 0; i < n; i++) {
				result += (ar[i] - bl) / 5;
				result += (ar[i] - bl) % 5 / 2;
				result += (ar[i] - bl) % 5 % 2 / 1;
			}
			br = Math.min(br, result);
		}
		System.out.println("min value : " + min);
		display(ar);
		return br;

	}

	static void display(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// int[] ar = { 2, 2, 3, 7 };
		int[] ar = { 10, 7, 12 };

		System.out.println(maxCount(ar));

	}
}
