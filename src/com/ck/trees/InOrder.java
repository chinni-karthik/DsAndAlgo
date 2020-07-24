package com.ck.trees;

public class InOrder {
	public static void inOrder(Node root) {
		// Base condition
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
}
