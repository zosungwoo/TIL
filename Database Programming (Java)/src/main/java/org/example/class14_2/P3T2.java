package org.example.class14_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P3T2 {
	public static void main(String[] args) throws Exception {
		String id = "root";
		String pw = "1234";
		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, pw);
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS db;");
		stmt.executeUpdate("USE db;");
		connection.setAutoCommit(false);
		String sql = "UPDATE users SET age = 21 WHERE id = 1;";
		DataRetriever.showResultSet(sql, stmt.executeQuery(sql));
		connection.commit();
		System.out.println("Hello World");
	}
}
