package com.main.orange;

public class CustomLinkedList {

	Node head;
	Node tail;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public void add(int d) {

		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		CustomLinkedList ln = new CustomLinkedList();
		ln.add(1);
		ln.add(4);
		ln.add(3);
		ln.add(2);
		ln.display();
	}
}
