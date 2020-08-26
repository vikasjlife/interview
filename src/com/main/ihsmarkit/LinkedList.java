package com.main.ihsmarkit;

public class LinkedList {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public Node head = null;
	public Node tail = null;

	public void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList ln = new LinkedList();
		ln.add(10);
		ln.add(20);
		ln.add(30);
		ln.add(40);
		ln.display();
	}

}
