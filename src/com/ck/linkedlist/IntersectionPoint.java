package com.ck.linkedlist;

public class IntersectionPoint {
	//https://leetcode.com/problems/intersection-of-two-linked-lists/
	public Node getIntersectionNode(Node headA, Node headB) {
        //Base condition
		if(headA==null || headB==null) {
			return null;
		}
		// Step 1
		int lenA = getLength(headA);
		int lenB = getLength(headB);
		// Step 2
		Node p = headA;
		Node q = headB;
		while (lenA > lenB) {
			p = p.next;
			lenA--;
		}
		while (lenA < lenB) {
			q = q.next;
			lenB--;
		}
		// Step 3
		while (p != q) {
			p = p.next;
			q = q.next;
		}
		return p;
    }
	private int getLength(Node node) {
		int length = 0;
		while (node != null) {
			node = node.next;
			length++;
		}
		return length;
	}
}
