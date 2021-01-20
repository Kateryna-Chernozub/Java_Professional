package com.javaProfessional.Lesson_10.main;

import com.javaProfessional.Lesson_10.task.task2.dto.Bird;

import java.io.*;

public class TaskSecondSerializationCopy {
    public static void main(String[] args) {
        Bird crow = new Bird("crow", 20, "black");

        ByteArrayOutputStream byteArrayOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;

        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

            objectOutputStream.writeObject(crow);

            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Bird cloneCrow = (Bird) objectInputStream.readObject();
            cloneCrow.setColor("gray");

            System.out.println(crow);
            System.out.println(cloneCrow);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (objectOutputStream != null) {
                try {
                    objectOutputStream.flush();
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
