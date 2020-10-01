package com.main.adityaverma;

public class PermutationWithSpaces {

	public static final String SPACES = "_";
	public static int count = 1;

	static void printPermutations(String op, String ip) {
		if (ip.length() == 0) {
			System.out.println(count + " " + op);
			count++;
			return;
		}
		printPermutations(op + SPACES + ip.substring(0, 1), ip.substring(1, ip.length()));
		printPermutations(op + ip.substring(0, 1), ip.substring(1, ip.length()));
	}

	public static void main(String[] args) {
		String op = "";
		String ip = "ABCDE";
		printPermutations(ip.substring(0, 1), ip.substring(1, ip.length()));
	}

}
