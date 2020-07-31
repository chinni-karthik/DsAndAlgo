package com.ck.trees;

public class NumberOfLeafNodes {
	static int getNumberOfLeafNodes(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		int leftLeaves = getNumberOfLeafNodes(root.left);
		int rightLeaves = getNumberOfLeafNodes(root.right);
		return leftLeaves + rightLeaves;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		System.out.println(getNumberOfLeafNodes(root));
	}
}
