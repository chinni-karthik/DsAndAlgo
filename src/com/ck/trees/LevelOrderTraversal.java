package com.ck.trees;

public class LevelOrderTraversal {
	public static void printLevel(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.data + " ");
		}
		printLevel(root.left, level - 1);
		printLevel(root.right, level - 1);
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		int height = HeightBTree.height(root);
		for (int i = 1; i <= height; i++) {
			printLevel(root, i);
		}
	}
}
