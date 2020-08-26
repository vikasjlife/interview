package com.main.orange;

import java.util.Arrays;

public class CustomeStackUsingArray<E> {

	private int size = 0;
	private int DEFAULT_SIZE = 5;
	private Object elements[];

	public CustomeStackUsingArray() {
		elements = new Object[DEFAULT_SIZE];
	}

	public void push(E e) {
		if (size == elements.length) {
			ensureCapcity();
		}
		elements[size++] = e;
	}

	public void ensureCapcity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public E pop() {
		E e = (E) elements[--size];
		elements[size] = null;
		return e;
	}

	public static void main(String[] args) {
		CustomeStackUsingArray<Integer> st = new CustomeStackUsingArray<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
	}
}
