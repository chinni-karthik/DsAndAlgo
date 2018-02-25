package com.ck.trees;

public class LowestCommonAncestor {
	static Node lca(Node root, int v1, int v2) {
		if (root == null) {
			return null;
		}
		if (root.data == v1 || root.data == v2) {
			return root;
		}

		Node Llca = lca(root.left, v1, v2);
		Node Rlca = lca(root.right, v1, v2);
		
		if (Llca == null && Rlca == null) {
			return null;
		}
		if (Llca == null) {
			return Rlca;
		}
		if (Rlca == null) {
			return Llca;
		}
		return root;
	}
}
