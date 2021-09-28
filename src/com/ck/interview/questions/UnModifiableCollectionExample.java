package com.ck.interview.questions;

import java.util.*;

public class UnModifiableCollectionExample {
    public static void main(String[] args) throws Exception {
        try {
            List<Character> list = new ArrayList<Character>();
            list.add('X');
            list.add('Y');
            System.out.println("Initial list: " + list);

            Collection<Character> immutableList = Collections.unmodifiableCollection(list);

            // Adding element to new Collection
            System.out.println("\nTrying to modify the unmodifiableCollection");
            immutableList.add('Z');
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}