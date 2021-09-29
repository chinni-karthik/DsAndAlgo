package com.ck.interview.questions.ds;

public class SortAbsolutelySortedLL {
    Node sortAbsolutelySortedLL(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            // If curr is smaller than prev, then it must be moved to head
            if (curr.data < prev.data) {
                // Detach curr from linked list
                prev.next = curr.next;

                // Move current node to beginning
                curr.next = head;
                head = curr;

                // Update current
                curr = prev;
            } else {
                // Nothing to do if current element is at right place
                prev = curr;
            }

            // Move current
            curr = curr.next;
        }
        return head;
    }
}
