package MyLessons.Lesson44.Task3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static MyLessons.Lesson44.Task3.ConnectionData.*;


public class InsertDataPreparedStatement {
    private static final String INSERT_QUERY =
            "INSERT INTO `phones` (`id`, `user_id`, `phone_number`) VALUES (?,?,?);";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setString(1, "1");
            preparedStatement.setString(2, "1");
            preparedStatement.setString(3, "1111111110");
            preparedStatement.addBatch();

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "2");
            preparedStatement.setString(3, "0222222222");
            preparedStatement.addBatch();
            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "3");
            preparedStatement.setString(3, "1067565656");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
