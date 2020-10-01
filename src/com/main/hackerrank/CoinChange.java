package com.main.hackerrank;

import java.util.Arrays;

public class CoinChange {

	static void coinChange(int[] S, int m, int n) {

		long[] table = new long[n + 1];
		Arrays.fill(table, 0);

		table[0] = 1;

		for (int i = 0; i < m; i++) {
			for (int j = S[i]; j <= n; j++) {
				table[j] = table[j] + table[j - S[i]];
			}
		}

		System.out.println(table[n]);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, -3 };

		int m = arr.length;
		int n = 4;
		coinChange(arr, m, n);

	}
}
