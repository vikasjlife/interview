package com.main.hackerrank;

public class StackDemo {

	static void sortArray(int[] ar) {
		int temp;
		for (int i = 1; i < ar.length; i++) {
			for (int j = i; j > 0; j--) {
				if (ar[j] < ar[j - 1]) {
					temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] ar = { 1, 1, 2, 2, 2, 2, 11, 11 };
		System.out.println(ar);
		sortArray(ar);
		System.out.println(ar);
		int pfound = 0;
		for (int i = 0; i < ar.length; i++) {
			if (i != ar.length - 1 && ar[i] == ar[i + 1]) {
				pfound++;
				i = i + 1;
			}
		}
		System.out.println(pfound);
	}
}
