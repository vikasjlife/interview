package com.main.orange;

public class BTree {

	BTree left, right;
	int data;

	BTree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new BTree(value);
			} else {
				left.insert(data);
			}
		} else {
			if (right == null) {
				right = new BTree(value);
			} else {
				right.insert(value);
			}
		}
	}

	public boolean contains(int value) {
		if (value == data) {
			return true;
		} else if (value <= data) {
			if (left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
	}

	public void printInOrder() {
		if (left != null) {
			left.printInOrder();
		}
		System.out.println(data);
		if (right != null) {
			right.printInOrder();
		}
	}

	public void mirror() {
		if (left == null) {
			left = right;
		} else {
			left.mirror();
		}

		if (right == null) {
			right = left;
		} else {
			right.mirror();
		}

	}

	public static void main(String[] args) {
		BTree bt = new BTree(10);
		bt.insert(9);
		bt.insert(15);
		bt.insert(17);
		System.out.println(bt.contains(9));
		bt.printInOrder();
		System.out.println();
		bt.mirror();
		System.out.println();
	}

}
