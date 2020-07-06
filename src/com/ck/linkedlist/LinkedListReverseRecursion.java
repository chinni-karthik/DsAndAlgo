package com.ck.linkedlist;
//https://youtu.be/KYH83T4q6Vs
public class LinkedListReverseRecursion {
	static Node reversedHead;
	public static Node reverseLinkedListUsingRecursion(Node head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			reversedHead = head;
			return reversedHead;
		}
		reverseLinkedListUsingRecursion(head.next);
		// Below lines will be executed for every recursive call, other than base case.
		Node q = head.next;
		q.next = head;
		head.next = null;
		return reversedHead;
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
		Node reversedLinkedList = reverseLinkedListUsingRecursion(head);
		LinkedListTraversal.linkedListTraversal(reversedLinkedList);
	}
}
