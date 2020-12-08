package com.nirajaky.standalone.collections;

import java.util.List;

public class Person {
    private List<String> friends;

    public Person(List<String> friends) {
        this.friends = friends;
    }

    public Person() {
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                '}';
    }
}
