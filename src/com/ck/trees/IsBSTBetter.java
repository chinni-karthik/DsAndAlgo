package com.ck.trees;

public class IsBSTBetter {
	public boolean isBST(Node root) {
		return isBSTHealper(root, 0, Integer.MAX_VALUE);
	}

	public boolean isBSTHealper(Node root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data <= min || root.data > max) {
			return false;
		}
		return isBSTHealper(root.left, min, root.data) && isBSTHealper(root.right, root.data, max);

	}
}
