package com.javaProfessional.Lesson_10.task.task3.dto;

public class Eagle extends Animal{
    private String species;

    public Eagle() {
    }

    public Eagle(String species, String type, int weight, int lifetime) {
        super(type, weight, lifetime);
        this.species = species;
    }

    public Eagle (Eagle other) {
        this(other.species, other.getType(),other.getWeight(), other.getLifetime());
    }

    @Override
    public String toString() {
        return "Animal{ " +
                "species = '" + species + '\'' +
                ", type = '" + getType() + '\'' +
                ", weight = " + getWeight() +
                ", lifetime = " + getLifetime() +
                '}';
    }
}
