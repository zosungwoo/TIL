package org.example.class3_4;

import java.sql.*;

public class SQLProgramming6 {
    public static void main(String[] args) throws Exception {

        String id = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("DROP DATABASE IF EXISTS dbp;");
        SQLWarning warnings = stmt.getWarnings();
        System.out.println(warnings);


    }
}
