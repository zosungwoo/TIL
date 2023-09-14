package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", "root", "1234");

        Statement stat = connection.createStatement();
        stat.executeUpdate("create database dbp2;");
        stat.executeUpdate("use dbp2;");

        connection.close();
    }
}
