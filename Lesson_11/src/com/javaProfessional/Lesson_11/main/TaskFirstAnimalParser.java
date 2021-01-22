package com.javaProfessional.Lesson_11.main;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class TaskFirstAnimalParser {
    public static void main(String[] args) {
        final String fileName = "D:\\IT\\my_projects\\Java_Professional\\Lesson_11\\src\\com\\javaProfessional\\Lesson_11\\task\\task1\\taskFirst.xml";

        try{
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler() {
                boolean name = false;
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    if (qName.equalsIgnoreCase("name")) {
                        name = true;
                    }
                }
                @Override
                public void characters (char ch[], int start, int length) throws SAXException{
                    if (name) {
                        System.out.println("Name: " + new String(ch, start, length));
                        name = false;
                    }
                }
//                boolean breed = false;
//                @Override
//                public void startElement(String uri, String localName, String qBreed, Attributes attributes) {
//                    if (qBreed.equalsIgnoreCase("breed")) {
//                        breed = true;
//                    }
//                }
//                @Override
//                public void characters (char ch[], int start, int length) throws SAXException{
//                    if (name) {
//                        System.out.println("Name: " + new String(ch, start, length));
//                        name = false;
//                    }
//                }
            };

            saxParser.parse(fileName, defaultHandler);

        } catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }
}
