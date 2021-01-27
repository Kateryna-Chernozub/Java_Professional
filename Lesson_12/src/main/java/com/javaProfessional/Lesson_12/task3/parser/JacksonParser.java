package com.javaProfessional.Lesson_12.task3.parser;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaProfessional.Lesson_12.task3.entity.Address;

import java.io.File;
import java.io.IOException;

public class JacksonParser {
    public static void parseJson() {
        ObjectMapper mapper = new ObjectMapper();

        Address firstAddress  = createUser();

        try {
            //Convert object to JSON string and save into file directly
            mapper.writeValue(new File("D:\\IT\\my_projects\\Java_Professional\\Lesson_12\\src\\main\\resources\\jacksonExample.json"), firstAddress);

            //Convert object to JSON string and pretty print
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(firstAddress);

            System.out.println(jsonInString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Address createUser() {
        Address addressFirstUser = new Address();

        addressFirstUser.setCountry("Ukraine");
        addressFirstUser.setCity("Kyiv");
        addressFirstUser.setStreet("Khreshchatyk");

        return addressFirstUser;
    }
}
