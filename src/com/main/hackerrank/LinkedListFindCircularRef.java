package com.main.hackerrank;

public class LinkedListFindCircularRef {

	Node head;
	Node tail;

	class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

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
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void createCircularRef() {
		tail.next = head;
	}

	public boolean detectCircle() {
		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null && fast != slow) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null && slow != null)
			return true;

		return false;

	}

	public static void main(String[] args) {
		LinkedListFindCircularRef ln = new LinkedListFindCircularRef();
		ln.add(12);
		ln.add(13);
		ln.add(1);
		ln.add(7);
		ln.add(8);
		ln.add(9);
		ln.add(10);
		ln.add(11);
		ln.add(15);

		ln.display();
		ln.detectCircle();
		System.out.println("Creating Circle");
		ln.createCircularRef();
		System.out.println(ln.detectCircle());
	}

}
