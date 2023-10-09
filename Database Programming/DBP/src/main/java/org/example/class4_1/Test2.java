package org.example.class4_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test2 {
    public static void main(String[] args) throws Exception{
        String id = "root";
        String password = "1234";

        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);

        Statement stat = connection.createStatement();
        stat.executeUpdate("CREATE OR REPLACE DATABASE dbp");
        stat.executeUpdate("USE dbp;");
        stat.executeUpdate(
                "CREATE TABLE IF NOT EXISTS account (" +
                        "account_number varchar(50) unique, branch_name varchar(50), balance int" +
                        ");"
        );

//        stat.executeUpdate("insert into account values('A-101', 'Downtown', 500)");
//        stat.executeUpdate("insert into account values(null, 'Mianus', 900)");  // not null 오류

        stat.executeUpdate("INSERT INTO account VALUES ('A-101', 'Downtown', 500)");
        stat.executeUpdate("INSERT INTO account VALUES ('A-102', 'Perryridge', 400)");
        stat.executeUpdate("INSERT INTO account VALUES (null, 'Brighton', 900)");
        stat.executeUpdate("INSERT INTO account VALUES (null, 'Mianus', 700)");  // null은 unique 대상에서 제외! (당연히 그래야 실용적임)
//        stat.executeUpdate("INSERT INTO account VALUES ('A-102', 'Perryridge', 300)");



//        stat.executeUpdate("DROP TABLE IF EXISTS customer2");
//        System.out.println(stat.getWarnings());




        connection.close();


    }
}
