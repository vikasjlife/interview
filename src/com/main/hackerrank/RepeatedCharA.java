package com.main.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedCharA {

	static long repeatedString(String s, long n) {
		if (s.equalsIgnoreCase("a") && s.length() == 1) {
			System.out.println(n);
			return n;
		}
		String temp = "";
		Pattern pat = Pattern.compile("a");
		Matcher match = pat.matcher(s);
		long occurence = 0;
		while (match.find()) {
			occurence++;
		}
		if (occurence != 0) {
			occurence = (n / s.length()) * occurence;
			if ((n % s.length()) != 0) {
				match = pat.matcher(s.substring(0, (int) (n % s.length())));
				while (match.find()) {
					occurence++;
				}
			}
		}
		// System.out.println(occurence);
		return occurence;
	}

	public static void main(String[] args) {
		long l = 549382313570L;
		String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
		System.out.println(repeatedString(s, 549382313570L));
		// System.out.println("abcd".substring(0, 4));
		System.out.println(549382313570L / 100);
		System.out.println(5493823135L * 3);

	}

}
