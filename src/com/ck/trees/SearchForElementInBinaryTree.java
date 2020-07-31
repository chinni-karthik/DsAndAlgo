package com.ck.trees;

public class SearchForElementInBinaryTree {
	static Node search(Node root, int x) {
		if (root == null) {
			return null;
		}
		if (root.data == x) {
			return root;
		}
		Node leftSearch = search(root.left, x);
		if (leftSearch != null) {
			return leftSearch;
		}
		Node rightSearch = search(root.right, x);
		if (rightSearch != null) {
			return rightSearch;
		}
		return null;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		System.out.println(search(root, 2).data);
	}
}
