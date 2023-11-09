package org.example.class6_0;

import java.sql.*;

public class UserDefinedFunction1 {

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
        stmt.executeUpdate("CREATE OR REPLACE FUNCTION ADD_VALUES(x INT, y INT) RETURNS INT BEGIN RETURN x+y; END;");

        ResultSet rs = stmt.executeQuery("SELECT ADD_VALUES(3,5)");
        while(rs.next()){
            System.out.println(rs.getInt(1));
        }


        connection.close();
    }
}
