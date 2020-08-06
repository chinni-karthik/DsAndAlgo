package com.ck.trees;

public class SearchForElementInBinarySearchTree {
	static Node search(Node root, int x) {
		if (root == null) {
			return null;
		}
		if (root.data == x) {
			return root;
		} else if (root.data < x) {
			return search(root.right, x);
		} else {
			return search(root.left, x);
		}
	}

	public static void main(String[] args) {
		Node root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(4);
		root.right.left = new Node(3);
		root.right.right = new Node(6);
		System.out.println(search(root, 10).data);
	}
}
