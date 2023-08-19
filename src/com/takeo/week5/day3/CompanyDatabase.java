package com.takeo.week5.day3;
//WAP in Java to create a table in database using jdbc with following specification :
//                table : Company(id,name,code,location)
//            -- write code to insert data in same table.
//            -- write code to retrieve data in same table.
//            -- write code to delete data in same table.


import java.sql.*;

public class CompanyDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Create table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS Company (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "code VARCHAR(10) NOT NULL," +
                    "location VARCHAR(100) NOT NULL)";

            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createTableQuery);
                System.out.println("Table 'Company' created successfully.");
            }

            // Insert data
            String insertQuery = "INSERT INTO Company (name, code, location) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, "Company 1");
                preparedStatement.setString(2, "C1");
                preparedStatement.setString(3, "Location 1");
                preparedStatement.executeUpdate();
                System.out.println("Data inserted successfully.");
            }

            // Retrieve data
            String selectQuery = "SELECT * FROM Company";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {
                System.out.println("Retrieved data:");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String code = resultSet.getString("code");
                    String location = resultSet.getString("location");
                    System.out.println("ID: " + id + ", Name: " + name + ", Code: " + code + ", Location: " + location);
                }
            }

            // Delete data
            String deleteQuery = "DELETE FROM Company WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, 1); // Assuming you want to delete the row with ID 1
                preparedStatement.executeUpdate();
                System.out.println("Data deleted successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
