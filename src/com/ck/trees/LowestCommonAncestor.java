package com.ck.trees;

public class LowestCommonAncestor {
	static Node lca(Node root, int node1, int node2) {
		if (root == null) {
			return null;
		}
		if (root.data == node1 || root.data == node2) {
			return root;
		}
		Node Llca = lca(root.left, node1, node2);
		Node Rlca = lca(root.right, node1, node2);
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
