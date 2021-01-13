package com.javaProfessional.Lesson_9.task.task_2.dto;

import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private int year;
    private static String color;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        color = "Black";
    }

    @Override
    public String toString() {
        return "Car{" + "model = '" + model + "', year = " + year + ", color = " + color + '}';
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

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Car.color = color;
    }
}
