package com.javaProfessional.Lesson_12.task4.parser;

import com.google.gson.Gson;
import com.javaProfessional.Lesson_12.task4.entity.Address;

import java.io.FileWriter;
import java.io.IOException;

public class GsonParser {
    public static void parseJson() {
        Gson gson = new Gson();

        Address secondAddress = createSecondAddress();

        try{
            //Java object to JSON, and save into a file
            gson.toJson(secondAddress, new FileWriter("D:\\IT\\my_projects\\Java_Professional\\Lesson_12\\src\\main\\resources\\gsonExample.json"));

            //Java object to JSON, and assign to a String
            String jsonInString = gson.toJson(secondAddress);
            System.out.println(jsonInString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Address createSecondAddress() {
        Address address = new Address();

        address.setCountry("Ukraine");
        address.setCity("Mykolaiv");
        address.setStreet("Sadova");

        return address;
    }
}
