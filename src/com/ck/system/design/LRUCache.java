package com.ck.system.design;

import java.util.ArrayList;
import java.util.HashMap;

public class LRUCache {
    private int capacity;
    private ArrayList<CacheEntry> keyList = new ArrayList<>();
    private HashMap<String, CacheEntry> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public LRUCache() {
        capacity = 10;// default capacity
    }

    /**
     * if cache contains the key,
     * modify the position in list and
     * return the value in cache.
     */
    public String get(String key) {
        if (cache.containsKey(key)) {
            CacheEntry cacheEntry = addToCacheAndModifyIndex(key);
            return cacheEntry.getValue();
        }
        return null;
    }

    /**
     * if cache contains the key, do same as get()
     * else, check if size is reached full, if yes, delete stale data
     * create new entry and add in cache and keyList
     */
    public void put(String key, String value) {
        if (cache.containsKey(key)) {
            CacheEntry cacheEntry = addToCacheAndModifyIndex(key);
        } else {
            cleanIfLimitReached();
            CacheEntry cacheEntry = new CacheEntry();
            cacheEntry.setIndex(keyList.size() - 1);
            cacheEntry.setKey(key);
            cacheEntry.setValue(value);
            cache.put(key, cacheEntry);
            keyList.add(cacheEntry.getIndex(), cacheEntry);
        }
    }

    private CacheEntry addToCacheAndModifyIndex(String key) {
        CacheEntry cacheEntry = cache.get(key);
        keyList.remove(cacheEntry.getIndex());
        cacheEntry.setIndex(keyList.size() - 1);
        keyList.add(cacheEntry.getIndex(), cacheEntry);
        return cacheEntry;
    }

    private void cleanIfLimitReached() {
        if (keyList.size() >= this.capacity) {
            keyList.remove(0);// delete least recently used
        }
    }
}
