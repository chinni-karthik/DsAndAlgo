package com.ck.trees;

public class PreOrder {
	public static void preOrder(Node root) {
		// Base condition
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
