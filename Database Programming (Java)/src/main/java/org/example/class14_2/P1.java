package org.example.class14_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class P1 {
	public static void main(String[] args) throws Exception {
		String id = "root";
		String pw = "1234";
		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, pw);
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("CREATE OR REPLACE DATABASE db;");
		stmt.executeUpdate("USE db;");
		stmt.executeUpdate("CREATE OR REPLACE TABLE student (name CHAR(10), test CHAR(10), score TINYINT); ");
		stmt.executeUpdate("INSERT INTO student VALUES ('Chun', 'SQL', 75);");
		stmt.executeUpdate("INSERT INTO student VALUES ('Chun', 'Tuning', 73);");
		stmt.executeUpdate("INSERT INTO student VALUES ('Esben', 'SQL', 43);");
		stmt.executeUpdate("INSERT INTO student VALUES ('Esben', 'Tuning', 31);");
		stmt.executeUpdate("CREATE OR REPLACE TABLE student (name CHAR(10), test CHAR(10), score TINYINT); ");
		connection.setAutoCommit(false);
		stmt.executeUpdate("INSERT INTO student VALUES ('Chun', 'SQL', 75);");
		stmt.executeUpdate("INSERT INTO student VALUES ('Chun', 'Tuning', 73);");
		stmt.executeUpdate("INSERT INTO student VALUES ('Esben', 'SQL', 43);");
		stmt.executeUpdate("INSERT INTO student VALUES ('Esben', 'Tuning', 31);");
		
		connection.commit();
		
		connection.close();
	}
}
