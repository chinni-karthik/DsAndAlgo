package com.ck.trees;

public class HeightBTree {
	static int height(Node root) {
		// Base Condition
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		} else {
			return rightHeight + 1;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println(height(root));
	}
}
