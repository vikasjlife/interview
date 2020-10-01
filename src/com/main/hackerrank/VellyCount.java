package com.main.hackerrank;

public class VellyCount {

	static int countingValleys(int n, String s) {
		int upSteps = 0;
		int downSteps = 0;
		int isBelowSeaLevel = 0;
		int countOfVelly = 0;
		char prev;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'U') {
				upSteps++;
			} else {
				downSteps++;
			}
			isBelowSeaLevel = upSteps - downSteps;
			if (isBelowSeaLevel < 0) {
				if (c == 'U') {
					prev = c;
				}
			}

		}
		return countOfVelly;
	}

	public static void main(String[] args) {
		System.out.println(countingValleys(0, "UDDDUDUU"));
	}

}
