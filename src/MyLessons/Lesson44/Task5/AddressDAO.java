package MyLessons.Lesson44.Task5;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static MyLessons.Lesson44.Task3.ConnectionData.*;

public class AddressDAO extends AbstractDAO<Integer, Address> {
    public static final String SQL_SELECT_ALL_USERS = "SELECT * FROM address";
    public static final String SQL_SELECT_USER_ID =
            "SELECT * FROM address WHERE id=?";

    @Override
    public List<Address> findAll() {
        List<Address> addresses = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_USERS);
            while (rs.next()) {
                int id = rs.getInt(1);
                String country = rs.getString(2);
                String city = rs.getString(3);
                String street = rs.getString(4);
                String postCode = rs.getString(5);
                addresses.add(new Address(id, country, city, street, postCode));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return addresses;
    }

    @Override
    public Address findEntityById(Integer id) {
        Address address = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(SQL_SELECT_USER_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String country = rs.getString(2);
                String city = rs.getString(3);
                String street = rs.getString(4);
                String postCode = rs.getString(5);
                address = new Address(id, country, city, street, postCode);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return address;
    }


    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM address WHERE ID=?";

        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void  create(Address address) {

        String sql = "INSERT INTO ADDRESS (COUNTRY, CITY, STREET, POST_CODE) VALUES(?, ?, ?, ?)";

        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(sql)) {

            preparedStatement.setString(1, address.getCountry());
            preparedStatement.setString(2, address.getCity());
            preparedStatement.setString(3, address.getStreet());
            preparedStatement.setString(4, address.getPostCode());
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}
