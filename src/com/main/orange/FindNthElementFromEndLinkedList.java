package com.main.orange;

public class FindNthElementFromEndLinkedList {
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
		System.out.println(tail);
	}

	public void printNthFromLast(int index) {
		Node main_ptr = head;
		Node ref_ptr = head;

		int count = 0;
		if (head != null) {
			while (count < index) {
				if (ref_ptr == null) {
					System.out.println(index + " is greater than the list length");
				}
				ref_ptr = ref_ptr.next;
				count++;
			}

			while (ref_ptr != null) {
				main_ptr = main_ptr.next;
				ref_ptr = ref_ptr.next;
			}
			System.out.println(index + "th element is " + main_ptr.data);
		}
	}

	public void dispplay() {
		Node current = head;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		FindNthElementFromEndLinkedList ln = new FindNthElementFromEndLinkedList();
		ln.add(1);
		ln.add(2);
		ln.add(3);
		ln.add(4);
		ln.add(5);
		ln.add(6);
		ln.dispplay();
		ln.printNthFromLast(6);
	}

}
