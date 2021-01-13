package com.javaProfessional.Lesson_9.task.task_1.dto;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    private String breed;
    private String name;

    public Animal(){
    }

    public Animal(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(breed, animal.breed) &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
