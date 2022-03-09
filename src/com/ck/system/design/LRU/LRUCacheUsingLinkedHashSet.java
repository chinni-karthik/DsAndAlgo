package com.ck.system.design.LRU;

import java.util.*;

class LRUCacheUsingLinkedHashSet {
    Set<Integer> cache;
    int capacity;

    public LRUCacheUsingLinkedHashSet(int capacity) {
        this.cache = new LinkedHashSet<>(capacity);
        this.capacity = capacity;
    }

    public boolean get(int key) {
        if (!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }


    public void put(int key) {
        if (cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }
        cache.add(key);
    }
}