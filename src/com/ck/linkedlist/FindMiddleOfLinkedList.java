package com.ck.linkedlist;

public class FindMiddleOfLinkedList {
	public static Node findMiddle(Node head) {
		if(head == null) {
			return null;
		}
		if(head.next==null) {
			return head;
		}
		Node p = head;
		int lenght = LinkedListLength.getLinkedListLength(head);
		int middle = (lenght/2)-1;
		int count = 0;
		while(count<middle) {
			p=p.next;
			count++;
		}
		return p;
	}
	public static void main(String[] args) {
		Node head = new Node(28);
		Node node27 = new Node(27);
		Node node26 = new Node(26);
		Node node25 = new Node(25);
		Node node24 = new Node(24);
		head.next = node27;
		node27.next = node26;
		node26.next = node25;
		node25.next = node24;
		Node middleNode = findMiddle(head);
		System.out.println(middleNode.data);
	}
}
