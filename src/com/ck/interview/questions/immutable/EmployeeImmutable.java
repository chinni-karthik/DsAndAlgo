package com.ck.interview.questions.immutable;

public final class EmployeeImmutable {
    private final int id;
    private Address address;

    public EmployeeImmutable(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }
    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }
}