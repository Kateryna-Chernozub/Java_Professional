package com.javaProfessional.Lesson_10.task.task1.dto;

public class Car implements Cloneable{
    private String model;
    private int year;
    private int price;
    private OrderId orderId;

    public Car() {
    }

    public Car(String model, int year, int price, OrderId orderId) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' + ", year=" + year + ", price=" + price +", order id=" + orderId +'}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderId orderId) {
        this.orderId = orderId;
    }
}
