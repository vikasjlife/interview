package com.main.orange;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {

	public static void sortArray(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] > ar[i + 1]) {
				int temp = ar[i];
				ar[i] = ar[i + 1];
				ar[i + 1] = temp;
				i = -1;
			}
		}
	}

	public static void main(String[] args) {
		int[] ar = { 0, 1, 2, 3, 1, 2, 2, 0, 0, 3, 4 };
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < ar.length; i++) {
			if (mp.isEmpty()) {
				mp.put(ar[i], 1);
			} else if (mp.containsKey(ar[i])) {
				int cnt = mp.get(ar[i]) + 1;
				mp.put(ar[i], cnt);
			} else {
				mp.put(ar[i], 1);
			}
		}

		System.out.println(mp);
	}

}
