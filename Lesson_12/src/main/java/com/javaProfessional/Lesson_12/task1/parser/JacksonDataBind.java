package com.javaProfessional.Lesson_12.task1.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaProfessional.Lesson_12.task1.entity.Person;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parseJson(String path) {
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = null;

        try {
            person = objectMapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(person);
    }
}
