package com.ck.system.design.LRU;

public class Node {
    Node next;
    Node prev;
    int value;
    int key;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{ key : " + key + "," +
                  "value : " + value + "}";
    }
}
