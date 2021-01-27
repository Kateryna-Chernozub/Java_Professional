package com.javaProfessional.Lesson_12.task2.parser;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.javaProfessional.Lesson_12.task2.entity.CurrencyRate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void parseJson(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        CurrencyRate[] currencyRate = gson.fromJson(jsonReader, CurrencyRate[].class);

        for (CurrencyRate rate : currencyRate) {
            System.out.println(rate);
        }

        String gsonString = gson.toJson(currencyRate);
        Files.write(Paths.get("D:\\IT\\my_projects\\Java_Professional\\Lesson_12\\src\\main\\resources\\gsonCurrencyRate.json"), gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
