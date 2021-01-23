package com.javaProfessional.Lesson_11.main;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class TaskFirstAnimalParser {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("D:/IT/my_projects/Java_Professional/Lesson_11/src/com/javaProfessional/Lesson_11/task/task1/taskFirst.xml");

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse(xmlFile);
            Element root = document.getDocumentElement();

            NodeList nodeList = root.getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {

                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Cat`s name: " + element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Breed: " + element.getElementsByTagName("breed").item(0).getChildNodes().item(0).getNodeValue() + "\n");
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
