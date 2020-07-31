package com.ck.trees;

public class MaximumElementInBinaryTree {
	static int getMaxElement(Node root) {
		// Base Condition
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int leftMax = getMaxElement(root.left);
		int rightMax = getMaxElement(root.right);
		return Math.max(root.data, Math.max(leftMax, rightMax));
	}

	public static void main(String[] args) {
		Node root = new Node(-1);
		root.left = new Node(-2);
		root.right = new Node(-3);
		root.right.left = new Node(-4);
		root.right.right = new Node(-5);
		System.out.println(getMaxElement(root));
	}
}
