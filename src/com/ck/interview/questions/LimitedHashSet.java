package com.ck.interview.questions;

import java.util.HashSet;

public class LimitedHashSet<E> extends HashSet<E> {
    private static final long serialVersionUID = -23456691722L;
    private final int limit;

    public LimitedHashSet(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean add(E object) {
        if (this.size() > limit) {
            return false;
        }
        return super.add(object);
    }
}