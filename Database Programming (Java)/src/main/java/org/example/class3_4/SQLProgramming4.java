package org.example.class3_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLWarning;
import java.sql.Statement;

public class SQLProgramming4 {
    public static void main(String[] args) throws Exception {

        String id = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE OR REPLACE DATABASE dbp CHARACTER SET euckr COLLATE euckr_korean_ci;");
        SQLWarning warnings = stmt.getWarnings();
        System.out.println(warnings);
        stmt.executeUpdate("USE dbp;");

    }
}
