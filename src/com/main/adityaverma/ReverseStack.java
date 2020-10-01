package com.main.adityaverma;

import java.util.Stack;

public class ReverseStack {

	public static void reverse(Stack<Integer> st) {
		if (st.size() == 0)
			return;
		int val = st.pop();
		reverse(st);
		reverseStack(st, val);

	}

	static void reverseStack(Stack<Integer> st, int val) {
		if (st.size() == 0) {
			st.push(val);
			return;
		}

		int vl = st.pop();
		reverseStack(st, val);
		st.push(vl);
		System.out.println(st);
	}

	public static void main(String[] arg) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}
}
