package com.javaProfessional.Lesson_10.task.task1.dto;

public class OrderId {
    private int id;

    public OrderId() {
    }

    public OrderId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderId= " + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
