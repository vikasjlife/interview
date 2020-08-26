package com.main.hackerrank;

public class CheckBST {

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			if (data < root.data) {
				Node cur;
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				Node cur;
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static boolean checkBST(Node root) {
		return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean checkBSTHelper(Node n, int min, int max) {
		if (n == null)
			return true;
		if (n.data <= min || n.data > max)
			return false;
		return (checkBSTHelper(n.left, min, n.data) && checkBSTHelper(n.right, n.data, max));
	}

	public static void main(String[] args) {
		Node root = null;
		root = insert(root, 4);
		root = insert(root, 2);
		root = insert(root, 6);
		root = insert(root, 1);
		root = insert(root, 3);
		root = insert(root, 5);
		root = insert(root, 7);
		System.out.println(checkBST(root));
	}
}
