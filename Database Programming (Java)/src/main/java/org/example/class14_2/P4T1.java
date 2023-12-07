package org.example.class14_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P4T1 {
	public static void main(String[] args) throws Exception {
		String id = "root";
		String pw = "1234";
		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, pw);
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS db;");
		stmt.executeUpdate("USE db;");
		stmt.executeUpdate("CREATE OR REPLACE TABLE users (id INTEGER, name VARCHAR(50), age INTEGER); ");
		stmt.executeUpdate("INSERT INTO users VALUES (1,'Joe',20), (2, 'Jill', 25);");
		connection.setAutoCommit(false);
		// connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
		String sql = "SELECT * FROM users WHERE age BETWEEN 10 and 30;";
		DataRetriever.showResultSet(sql, stmt.executeQuery(sql));
		sql = "SELECT * FROM users WHERE age BETWEEN 10 and 30;";
		DataRetriever.showResultSet(sql, stmt.executeQuery(sql));
		connection.commit();
	}
}
