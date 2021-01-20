package com.javaProfessional.Lesson_10.main;

import com.javaProfessional.Lesson_10.task.task3.dto.Eagle;

public class TaskThirdCloningWithExtends {
    public static void main(String[] args) {
        Eagle originalEagle = new Eagle("Golden eagle", "Bird", 7, 40);
        Eagle cloneEagle = new Eagle(originalEagle);

        System.out.println(originalEagle);
        System.out.println(cloneEagle);
    }
}
