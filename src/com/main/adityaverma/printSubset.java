package com.main.adityaverma;

public class printSubset {

	static void subSet(String op, String ip) {
		if (ip.length() == 0) {
			System.out.println(op);
			return;
		}
		subSet(op, ip.substring(1, ip.length()));
		subSet(op + ip.substring(0, 1), ip.substring(1, ip.length()));
	}

	public static void main(String[] args) {
		String op = "";
		String ip = "abc";
		subSet(op, ip);
	}

}
