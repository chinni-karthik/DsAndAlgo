package com.ck.linkedlist;

public class LinkedListInsert {
	// Start,End,at an index
	public static Node insertFirst(Node head, int x) {
		Node q = new Node(x);
		// Base Condition
		if (head == null) {
			return q;
		}
		Node p = head;
		q.next = p;
		return q;
	}

	public static Node insertLast(Node head, int x) {
		Node p = new Node(x);
		if (head == null) {
			return p;
		}
		Node q = head;
		while (q.next != null) {
			q = q.next;
		}
		q.next = p;
		return head;
	}

	public static Node insertAtIndex(Node head, int x, int index) {
		int lenght = LinkedListLength.getLinkedListLength(head);
		Node updatedLinkedList = null;
		if (index > lenght) {
			return null;// You can throw an exception here!
		}
		if (index == 0 || lenght == 0) {
			updatedLinkedList = insertFirst(head, x);
			return updatedLinkedList;
		}
		if (index == lenght) {
			updatedLinkedList = insertLast(head, x);
			return updatedLinkedList;
		}
		Node p = head;
		Node q = new Node(x);
		int count = 1;
		while (p.next != null) {
			Node r = p.next;
			if (index == count) {
				p.next = q;
				q.next = r;
				break;
			}
			p = p.next;
			count++;
		}
		return head;
	}

	public static void main(String[] args) {
		Node head = new Node(16);
		Node node13 = new Node(13);
		Node node7 = new Node(7);
		head.next = node13;
		node13.next = node7;
		insertAtIndex(head, 1, 2);
		LinkedListTraversal.linkedListTraversal(head);
	}
}
