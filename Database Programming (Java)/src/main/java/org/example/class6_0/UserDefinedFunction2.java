package org.example.class6_0;

import java.sql.*;

public class UserDefinedFunction2 {
    public static void main(String[] args) throws SQLException {
        String id = "root";
        String pw = "1234";
        Connection connection =
                DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, pw);
        // Each SQL can be executed with a Statement instance
        Statement stmt = connection.createStatement();
        // DDL
        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS dbp");
        stmt.executeUpdate("USE dbp");

        stmt.executeUpdate("CREATE OR REPLACE TABLE ten (value INT)");
        for (int i = 0; i <= 10; i++) {
            stmt.executeUpdate("INSERT INTO ten VALUES (" + i + ")");
        }

        stmt.executeUpdate("CREATE OR REPLACE FUNCTION SUM_VALUES() RETURNS INT " +
                "BEGIN " +
                "DECLARE sum INT;" +
                "SET sum = 0;" +
                "FOR i IN (SELECT value FROM ten)" +
                "DO " +
                "SET sum = sum + i.value;" +
                "END FOR; " +
                "RETURN sum;" +
                "END;");

        ResultSet rs = stmt.executeQuery("SELECT SUM_VALUES()");
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }


        connection.close();
    }
}
