package org.example.class3_4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLProgramming7 {
    public static void main(String[] args) throws Exception {

        String id = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE OR REPLACE DATABASE dbp;");
        stmt.executeUpdate("USE dbp;");

        ResultSet rs = stmt.executeQuery("SHOW DATABASES");
        List<String> dbNames = new ArrayList<>();

        while (rs.next()) {
            String dbName = rs.getString(1);
            if(dbName.equals("information_schema") || dbName.equals("sys") || dbName.equals("mysql") || dbName.equals("performance_schema"))
                continue;
            dbNames.add(dbName);
        }


        for (String dbName:
             dbNames) {
            stmt.executeUpdate("DROP DATABASE " + dbName);
        }

    }
}
