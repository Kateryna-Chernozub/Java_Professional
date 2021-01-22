package com.javaProfessional.Lesson_11.main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class TaskFirstEntryPoint {
    public static void main(String[] args) throws TransformerConfigurationException {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            Element rootElement = document.createElement("animal");
            document.appendChild(rootElement);

            Element cat1 = document.createElement("cat");
            rootElement.appendChild(cat1);
            //add element name
            Element name1 = document.createElement("name");
            name1.setTextContent("Marsel");
            cat1.appendChild(name1);
            //add element age
            Element age1 = document.createElement("age");
            age1.setTextContent("7");
            cat1.appendChild(age1);
            //add element breed
            Element breed1 = document.createElement("breed");
            breed1.setTextContent("Sphinx");
            cat1.appendChild(breed1);
            //add element weight
            Element weight1 = document.createElement("weight");
            weight1.setTextContent("6");
            cat1.appendChild(weight1);

            //TODO 2nd cat

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("D:/IT/my_projects/Java_Professional/Lesson_11/src/com/javaProfessional/Lesson_11/task/task1/taskFirst.xml"));

            transformer.transform(source, streamResult);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
