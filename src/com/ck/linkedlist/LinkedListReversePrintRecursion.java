package com.ck.linkedlist;

public class LinkedListReversePrintRecursion {
	public static Node reverseUsingRecursion(Node head) {
		if(head==null) {
			return null;
		}
		Node p = head;
		reverseUsingRecursion(p.next);
		System.out.print(head.data+" ");
		return head;
	}
	public static void main(String[] args) {
		Node head = new Node(28);
		Node node27 = new Node(27);
		Node node26 = new Node(26);
		Node node25 = new Node(25);
		head.next = node27;
		node27.next = node26;
		node26.next = node25;
//		node25.next = null;
		reverseUsingRecursion(head);
	}
}
