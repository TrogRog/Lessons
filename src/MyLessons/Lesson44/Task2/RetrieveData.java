package MyLessons.Lesson44.Task2;

import java.sql.*;


import static MyLessons.Lesson44.Task2.ConnectionData.*;

public class RetrieveData {
    private static final String SELECT_QUERY = "SELECT * FROM phones;";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            System.out.printf("%-5s%-10s%s%n", "id", "user_id", "phone_number");
            System.out.println("-------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int name = resultSet.getInt("user_id");
                int phone = resultSet.getInt("phone_number");
                System.out.printf("%-5s%-10s%s%n", id, name, phone);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}