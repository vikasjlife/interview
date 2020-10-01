package com.main.adityaverma;

public class PrintNthBinary {

	static void printBinary(String op, int ones, int zeros, int n) {
		if (n == 0) {
			System.out.println(op);
			return;
		}
		printBinary(op + "1", ones + 1, zeros, n - 1);
		if (ones != zeros) {
			printBinary(op + "0", ones, zeros + 1, n - 1);
		}
	}

	public static void main(String[] args) {
		String op = "";
		int n = 10;
		int ones = n;
		int zeros = n;
		printBinary(op, ones, zeros, n);

	}

}
