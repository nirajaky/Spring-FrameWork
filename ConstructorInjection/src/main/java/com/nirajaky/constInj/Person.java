package com.nirajaky.constInj;

public class Person {
    private int id;
    private String name;
    private Certi certi;
    public Person(String name , int id, Certi certi) {
        this.id = id;
        this.name = name;
        this.certi = certi;
    }
    public String toString(){
        return this.name + " : " + this.id + "{ " + this.certi.name + " }";
    }
}
