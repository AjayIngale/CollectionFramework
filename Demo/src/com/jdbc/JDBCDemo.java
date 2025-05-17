package com.jdbc;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";

        try {
            // Step 1: Import JDBC packages
            // Step 2: Load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3: Establish a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");

            // Step 4: Create a statement
            Statement statement = connection.createStatement();

            // Step 5: Execute SQL queries
            String sql = "select * from employee";
            ResultSet resultSet = statement.executeQuery(sql);

            // Step 6: Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println(id + ", " + name + ", " + email);
            }

            // Step 7: Close the connections
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}