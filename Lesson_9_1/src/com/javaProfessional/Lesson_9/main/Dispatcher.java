package com.javaProfessional.Lesson_9.main;

import com.javaProfessional.Lesson_9.task.task_2.dto.Car;

import java.io.*;

public class Dispatcher {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", 2020);
        File file = new File("D:/IT/my_projects/Java_Professional/Lesson_9_1/src/com/javaProfessional/Lesson_9/task/task_2/taskSecond.txt");


        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){

            objectOutputStream.writeObject(car);

            car = (Car) objectInputStream.readObject();
            System.out.println(car);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
