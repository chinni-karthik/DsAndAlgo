package com.ck.trees;

public class PostOrder {
	public static void postOrder(Node root) {
		// Base condition
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}
