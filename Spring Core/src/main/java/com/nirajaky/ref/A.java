package com.nirajaky.ref;

public class A {
    private int x;
    private B b;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A(int x, B b) {
        this.x = x;
        this.b = b;
    }

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", b=" + b +
                '}';
    }
}
