package main.demo1;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class AbstractFactoryDemo1 {
    public static void main(String[] args) throws Exception {

        String xml = "<document><body><stock>APPL</stock></body></document>";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document document = factory.parse(inputStream);
        document.getDocumentElement().normalize();

        System.out.println("Root element: " + document.getDocumentElement().getNodeName());

        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());
    }
}
