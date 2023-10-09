package org.example.class4_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test1 {
    public static void main(String[] args) throws Exception{
        String id = "root";
        String password = "1234";

        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);

        Statement stat = connection.createStatement();
//        stat.executeUpdate("CREATE DATABASE IF NOT EXISTS dbp");
        stat.executeUpdate("CREATE OR REPLACE DATABASE dbp");
        stat.executeUpdate("USE dbp;");
        stat.executeUpdate(
                "CREATE TABLE IF NOT EXISTS customer2 (" +
                        "customer VARCHAR(50), customer_street VARCHAR(50), customer_city VARCHAR(50), latitude DOUBLE, longitude DOUBLE, last_update DATE" +
                        ");"
        );

        // latitude longitude 수정
        stat.executeUpdate("ALTER TABLE customer2 DROP COLUMN latitude");
        stat.executeUpdate("ALTER TABLE customer2 DROP COLUMN longitude");

        stat.executeUpdate("ALTER TABLE customer2 RENAME COLUMN customer TO customer_name");
        stat.executeUpdate("ALTER TABLE customer2 ADD COLUMN (geopoint POINT)");
        stat.executeUpdate("ALTER TABLE customer2 MODIFY customer_street VARCHAR(100)");




//        stat.executeUpdate("DROP TABLE IF EXISTS customer2");
//        System.out.println(stat.getWarnings());




        connection.close();


    }
}
