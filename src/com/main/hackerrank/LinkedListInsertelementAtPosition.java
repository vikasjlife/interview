package com.main.hackerrank;

public class LinkedListInsertelementAtPosition {

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
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public Node insertAt(int data, int position) {
		Node headNode = head;
		Node newNode = new Node(data);
		if (position == 0) {
			newNode.next = headNode;
			headNode = newNode;
		}

		while (position != 0) {
			if (position == 1) {
				System.out.println("inserting " + data + " before " + headNode.data);
				newNode.next = headNode.next;
				headNode.next = newNode;
				break;
			}
			headNode = headNode.next;
			position--;
		}

		return headNode;
	}

	public static void main(String[] args) {
		LinkedListInsertelementAtPosition ln = new LinkedListInsertelementAtPosition();
		ln.add(16);
		ln.add(13);
		ln.add(7);
		int val = 1;
		int pos = 2;
		System.out.println("Before Element inserted");
		ln.display();
		System.out.println("insert element " + val + " at position " + pos);
		ln.insertAt(val, pos);
		System.out.println("After Element inserted");
		ln.display();
	}
}
