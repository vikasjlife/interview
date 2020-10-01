package com.main.hackerrank;

public class SortArray {

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
		int[] ar = { 1, 2, 3, 1, 1, 4, 6 };
		sortArray(ar);
		System.out.println(ar);
	}

}
