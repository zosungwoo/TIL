package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SQLException {
        String id = "root";
        String password = "1234";


        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306", id, password);

        Statement stat = connection.createStatement();
        stat.executeUpdate("CREATE OR REPLACE DATABASE dbp3;");  // DB가 다시 생성됨. 따라서 아래 테이블도 사라졌다가 다시 만들어짐
        stat.executeUpdate("USE dbp3;");
        stat.executeUpdate("CREATE TABLE loan (loan_number VARCHAR(10), branch_name VARCHAR(10), amount VARCHAR(10))");
        stat.executeUpdate("INSERT INTO loan VALUES ('L-11', 'Round Hill', '900');");
        stat.executeUpdate("INSERT INTO loan VALUES ('L-14', 'Downtown', '1500');");
        stat.executeUpdate("INSERT INTO loan VALUES ('L-15', 'Perryridge', '1500');");
        stat.executeUpdate("INSERT INTO loan VALUES ('L-16', 'Perryridge', '1300');");
        stat.executeUpdate("INSERT INTO loan VALUES ('L-17', 'Downtown', '1000');");
        stat.executeUpdate("INSERT INTO loan VALUES ('L-23', 'Redwood', '2000');");
        stat.executeUpdate("INSERT INTO loan VALUES ('L-93', 'Mianus', '500');");

        ResultSet rs = stat.executeQuery("select * from loan");
        while (rs.next()) {
            String loanNumber = rs.getString("loan_number");
            String branchName = rs.getString("branch_name");
            String amount = rs.getString("amount");
            System.out.println(loanNumber + "\t" + branchName + "\t" + amount);
        }

        connection.close();
    }
}