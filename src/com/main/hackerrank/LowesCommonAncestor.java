package com.main.hackerrank;

public class LowesCommonAncestor {

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}

	}

	public static Node lca(Node root, int v1, int v2) {
		Node n = root;
		while (n != null) {
			if (v1 > n.data && v2 > n.data)
				n = n.right;
			else if (v1 < n.data && v2 < n.data)
				n = n.left;
			else
				return n;
		}
		return n;
	}

	public static void main(String[] args) {
		Node root = null;
		root = insert(root, 3);
		root = insert(root, 1);
		root = insert(root, 4);
		root = insert(root, 2);
		root = insert(root, 5);
		root = insert(root, 6);
		System.out.println(lca(root, 5, 6).data);
	}

}
