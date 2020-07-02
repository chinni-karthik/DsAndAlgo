package com.ck.linkedlist;

public class LinkedListLength {
	public static int getLinkedListLength(Node head) {
		if (head == null) {
			return 0;
		}
		Node p = head;
		int count = 0;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}
	public static void main(String[] args) {
		Node head = new Node(28);
		Node node27 = new Node(27);
		Node node26 = new Node(26);
		Node node25 = new Node(25);
		head.next = node27;
		node27.next = node26;
		node26.next = node25;
		int linkedListLenght = getLinkedListLength(head);
		System.out.println(linkedListLenght);
	}
}
