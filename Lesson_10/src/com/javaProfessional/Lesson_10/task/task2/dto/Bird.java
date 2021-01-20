package com.javaProfessional.Lesson_10.task.task2.dto;

import java.io.Serializable;

public class Bird implements Serializable {
    private static String breed;
    private final int speed = 20;
    private transient String color;

    public Bird () {
    }

    public Bird(String breed, int speed,String color) {
        this.breed = breed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" + "breed = " + breed + ", speed = " + speed + ", color = '" + color + '}';
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String breed) {
        Bird.breed = breed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
