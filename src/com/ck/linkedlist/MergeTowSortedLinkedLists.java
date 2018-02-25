package com.ck.linkedlist;

public class MergeTowSortedLinkedLists {
	Node mergeLists(Node headA, Node headB) {
		if (headA == null && headB == null) {
			return null;
		} else if (headA == null) {
			return headB;
		} else if (headB == null) {
			return headA;
		}
		Node p = headA;
		Node q = headB;
		Node r = null;
		// Need to initialize r with either p or q
		if (p.data < q.data) {
			r = p;
			p = p.next;
		} else if (q.data < p.data) {
			r = q;
			q = q.next;
		}
		Node rHead = r;
		// Now iterate over like the example in array
		while (p != null && q != null) {
			if (p.data < q.data) {
				r.next = p;
				p = p.next;
			} else if (q.data < p.data) {
				r.next = q;
				q = q.next;
			}
		}
		if (p != null) {
			r.next = p;
		} else if (q != null) {
			r.next = q;
		}
		return rHead;
	}

}
