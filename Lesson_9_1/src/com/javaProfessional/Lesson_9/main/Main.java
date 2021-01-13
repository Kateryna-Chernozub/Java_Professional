package com.javaProfessional.Lesson_9.main;

import com.javaProfessional.Lesson_9.task.task_1.dto.Animal;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task_1: Performs an object serialization and deserialization operation");
        File file = new File("D:/IT/my_projects/Java_Professional/Lesson_9_1/src/com/javaProfessional/Lesson_9/task/task_1/TaskFirst.txt");
        Animal animal = new Animal("Dog", "Mona");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(animal);

            Animal animal1 = (Animal) objectInputStream.readObject();
            System.out.println(animal1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
