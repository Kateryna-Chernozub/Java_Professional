package com.javaProfessional.Lesson_10.task.task3.dto;

public class Animal {
    private String type;
    private int weight;
    private int lifetime;

    public Animal() {
    }

    public Animal(String type, int weight, int lifetime) {
        this.type = type;
        this.weight = weight;
        this.lifetime = lifetime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
}
