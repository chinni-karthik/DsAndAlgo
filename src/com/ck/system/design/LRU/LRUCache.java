package com.ck.system.design.LRU;

import java.util.HashMap;

/*
 * Two major components - HashMap - O(1)
 * Doubly Linked List - Node - O(1)
 */
public class LRUCache {
    Node head;
    Node tail;
    HashMap<Integer, Node> map = null;
    int cap = 0;

    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        if(map.get(key) == null) {
            return -1;
        }
        Node t = map.get(key);
           removeNode(t); // remove the node from its current location
           offerNode(t); // add the node to the tail
        return t.value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node t = map.get(key);
                t.value = value;

                removeNode(t);
                offerNode(t);
        } else {
            if(map.size() >= cap) {
                //delete the element at the head
                map.remove(head.key);
                removeNode(head);
            }

            Node newNode = new Node(key,value);
                offerNode(newNode);
                map.put(key, newNode);
        }
    }

    public void removeNode(Node n) {
        if(n.prev != null) {
            n.prev.next = n.next;
        } else {
            head = n.next;
        }

        if(n.next != null) {
            n.next.prev = n.prev;
        } else {
            tail = n.prev;
        }
    }

    // add most recently used element to the tail of list
    public void offerNode(Node n) {
        if(tail != null) {
            tail.next = n;
        }

        n.prev = tail;
        n.next = null;
        tail = n;

        if(head == null) {
            head = tail;
        }
    }

    public void displayCache() {
        Node c = head;
        while(c != null) {
            System.out.println(c.toString());
            c = c.next;
        }
    }

    public static void main(String[] args) {
        int capacity = 3;

        LRUCache lru = new LRUCache(capacity);

            lru.put(1,1);
            lru.put(2,2);
            lru.put(3,3);

            lru.displayCache();

            System.out.println("--------------------------");

            lru.put(4,4);

            lru.displayCache();


        System.out.println("--------------------------");

        lru.put(7,7);

        lru.displayCache();

        int result = lru.get(7);

        System.out.println("Result : " + result);
        lru.displayCache();

        result = lru.get(3);

        System.out.println("Result : " + result);
        lru.displayCache();
    }

}
