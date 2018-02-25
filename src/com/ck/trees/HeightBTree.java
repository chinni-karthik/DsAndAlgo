package com.ck.trees;
public class HeightBTree {
	static int height(Node root) {
		if (root == null) {
			return -1;//to get proper output for hacker rank problem...!!!
		}
		
		int leftHeight 	= height(root.left);
		int rightHeight = height(root.right);
		
		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		} else {
			return rightHeight + 1;
		}
	}
}
