package org.example.class14_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P2T1 {
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
		connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
		String sql = "SELECT age FROM users WHERE id = 1;";
		DataRetriever.showResultSet(sql, stmt.executeQuery(sql));  // 업뎃 전 20
		sql = "SELECT age FROM users WHERE id = 1;";
		DataRetriever.showResultSet(sql, stmt.executeQuery(sql));  // 업뎃 후 21
		sql = "SELECT age FROM users WHERE id = 1;";
		DataRetriever.showResultSet(sql, stmt.executeQuery(sql));  // rollback 후 20

		// 콘솔은 serializable (안바뀜)
	}
}
