package com.nirajaky.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price of Pepsi");
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    public Pepsi(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("In destroy() Method of Pepsi");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In init() method of Pepsi");
    }
}
