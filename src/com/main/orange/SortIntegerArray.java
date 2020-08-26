package com.main.orange;

public class SortIntegerArray {

	public static void main(String[] args) {
		int[] ar = { 0, 1, 2, 3, 1, 2, 2, 0, 3, 0, 4 };
		int temp;
		int count = 0;
		for (int j = 0; j < ar.length - 1; j++) {
			if (ar[j] > ar[j + 1]) {
				temp = ar[j];
				ar[j] = ar[j + 1];
				ar[j + 1] = temp;
				j = -1;
			}
		}

		SortIntegerArray.display(ar);
	}

	public static void display(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
