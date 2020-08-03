package com.ck.trees;

public class IsBST {
	public boolean isBST(Node root) {
		if (root == null) {
			return true;
		}
		if (root.left != null && root.left.data > root.data) {
			return false;
		}
		if (root.right != null && root.right.data > root.data) {
			return false;
		}
		return isBST(root.left) && isBST(root.right);
	}
}
