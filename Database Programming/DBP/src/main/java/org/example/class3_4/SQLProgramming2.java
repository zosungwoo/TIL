package org.example.class3_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLProgramming2 {
    public static void main(String[] args) {

        String id = "root";
        String password = "1234";
        Connection connection;
        Statement stmt = null;

        try{
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);
            stmt = connection.createStatement();
            stmt.executeUpdate("CREATE DATABASE dbp;");
            stmt.executeUpdate("USE dbp;");
        } catch (Exception e) {
            try {
                stmt.executeUpdate("USE dbp;");
            } catch (Exception e2) {

            }
        }
    }
}
