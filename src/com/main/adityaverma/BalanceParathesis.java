package com.main.adityaverma;

public class BalanceParathesis {

	static void generateBalanceParathesis(String op, int o, int c) {
		if (o == 0 && c == 0) {
			System.out.println(op);
			return;
		}
		if (o == c) {
			generateBalanceParathesis(op + "(", o - 1, c);
		} else {
			if (o != 0) {
				generateBalanceParathesis(op + "(", o - 1, c);
			}
			if (c != 0) {
				generateBalanceParathesis(op + ")", o, c - 1);
			}
		}
	}

	public static void main(String[] args) {
		String op = "";
		int n = 4;
		int o = n;
		int c = n;
		generateBalanceParathesis(op, o, c);

	}

}
