package org.example.week3_3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class XMLTest1 {

    public static String toString(Document doc) throws Exception {  // doc을 보기 위한 방법 (참고만 하면 됨)
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);

        transformer.transform(source, result);

        return writer.toString();
    }


    public static void main(String[] args) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("account");
        doc.appendChild(root);  // doc -> account 연결
        root.setAttribute("xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
        root.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");

        Element accountNumber = doc.createElement("account_number");
        accountNumber.setAttribute("xsi:type", "xsd:string");
        accountNumber.setTextContent("A-101");

        Element branchName = doc.createElement("branch_name");
        branchName.setAttribute("xsi:type", "xsd:string");
        branchName.setTextContent("Downtown");

        Element balance = doc.createElement("balance");
        balance.setAttribute("xsi:type", "xsd:integer");
        balance.setTextContent("500");

        root.appendChild(accountNumber);  // account -> account_number 연결
        root.appendChild(branchName);
        root.appendChild(balance);

        System.out.println(toString(doc));
    }
}
