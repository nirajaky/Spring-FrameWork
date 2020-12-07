package com.nirajaky.lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price of Samosa");
        this.price = price;
    }

    public Samosa() {
        super();
    }

    public Samosa(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("In init method of Samosa");
    }
    public void destroy(){
        System.out.println("In destroy Method of Samosa");
    }
}
