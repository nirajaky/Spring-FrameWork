package com.nirajaky.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

    private Address address;

    public Emp() {
        super();
    }

    public Emp(Address address) {
        System.out.println("Parametrized Constrictor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    @Qualifier("temp2")
    public void setAddress(Address address) {
        System.out.println("Setter Methods");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
