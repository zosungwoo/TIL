package org.example.week3_3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountLoader {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Database Programming/DBP/src/main/java/org/example/data/account.xml"));

        String text = "";
        List<String> list = r.lines().toList();

        for (String line :
                list) {
            text += line + "\n";
        }
        r.close();

//        System.out.println(text);


        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(text)));

        NodeList accounts = doc.getElementsByTagName("account");

        ArrayList<Account> accountList = new ArrayList<>();

        for (int i = 0; i <accounts.getLength() ; i++) {
            Node account = accounts.item(i);  // 사실 Elemnet는 Node임 (Element extends Node)
            if(account instanceof Element)  // Element의 인스턴스이기도 하대 ㅇㅇ.. 그래서 실행됨
            {
                Element accountElement = (Element) account;
                String accountNumber = accountElement.getElementsByTagName("account_number").item(0).getTextContent();
                String branchName = accountElement.getElementsByTagName("branch_name").item(0).getTextContent();
                int balance = Integer.parseInt(accountElement.getElementsByTagName("balance").item(0).getTextContent());

//                System.out.println(accountNumber + ", " + branchName + ", " + balance);
                Account a = new Account(accountNumber, branchName, balance);
//                System.out.println(a.toString());
                accountList.add(a);
            }
        }

//        for (Account a :
//                accountList) {
//            System.out.println(a);
//        }

        // connection 을 맺어야 한다.
        String id = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE OR REPLACE DATABASE dbp_account;");
        stmt.executeUpdate("USE dbp_account;");
        stmt.executeUpdate("CREATE TABLE account (account_number VARCHAR(50), branch_name VARCHAR(50), balance INTEGER);");


        for (Account a : accountList) {
            String str = "INSERT INTO account VALUES('" + a.getAccountNumber() + "','" + a.getBranchName() + "'," + a.getBalance() + ");";
            stmt.executeUpdate(str);
        }


        // database 저장 종료

        ResultSet rs = stmt.executeQuery("SELECT * FROM account;");
        while (rs.next()) {
            String accountNumber = rs.getString(1);  // 1부터 시작!!!
            String branchName = rs.getString(2);
            int balance = rs.getInt(3);
            System.out.println(new Account(accountNumber, branchName, balance).toString());
        }







    }
}
