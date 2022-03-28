package com.java8.features.comparators;

public class StockOrder implements Comparable<StockOrder>{

    private int quantity;
    private int price;
    private int totalPrice ;


    public StockOrder(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = this.quantity * this.price;
    }

    public StockOrder() {

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public int compareTo(StockOrder o) {
        return Integer.compare(this.getTotalPrice() , o.getTotalPrice());
    }

    @Override
    public String toString() {
        return "StockOrder{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
