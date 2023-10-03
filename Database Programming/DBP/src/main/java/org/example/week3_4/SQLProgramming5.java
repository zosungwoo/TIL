package org.example.week3_4;

import java.sql.*;
import java.util.ArrayList;

public class SQLProgramming5 {
    public static void main(String[] args) throws Exception {

        String id = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE OR REPLACE DATABASE dbp CHARACTER SET euckr COLLATE euckr_korean_ci;");
        SQLWarning warnings = stmt.getWarnings();
        System.out.println(warnings);
        stmt.executeUpdate("USE dbp;");


        ResultSet rs = stmt.executeQuery("SHOW DATABASES");
        ResultSetMetaData rsmd = rs.getMetaData();
        ArrayList<String> columnNames = new ArrayList<>();
        for (int i = 0; i < rsmd.getColumnCount(); i++) {
//            System.out.println(rsmd.getColumnName(i+1) + ",  " + rsmd.getColumnType(i+1));  // 1부터 이므로
            columnNames.add(rsmd.getColumnName(i + 1));
        }

        while (rs.next()) {
            String line = "";
            for (int i = 0; i < columnNames.size(); i++) {
                line += rs.getString(i+1)  + ", ";
            }
            System.out.println(line);
//            String databaseName = rs.getString(1);
//            System.out.println(databaseName);
        }

    }
}
