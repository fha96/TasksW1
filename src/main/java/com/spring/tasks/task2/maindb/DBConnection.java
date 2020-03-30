package com.spring.tasks.task2.maindb;

import com.spring.tasks.task2.entity.Car;

import java.sql.*;

public class DBConnection {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public DBConnection() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", "root@JEA");
    }

    public void saveCar(String query, Car car) throws SQLException {
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, car.getId());
        preparedStatement.setString(2, car.getType());
        preparedStatement.setString(3, car.getVersion());
        preparedStatement.setString(4, car.getModel());
        preparedStatement.setString(5, car.getOwner());
        preparedStatement.setString(6, car.getColor());
        preparedStatement.setString(7, car.getNumberOfSeats());
        preparedStatement.setString(8, car.getLicenseExpiry());
        preparedStatement.setString(9, car.getTrafficViolationTotalAmount());
        preparedStatement.executeUpdate();
    }

    public ResultSet findCar(String query) throws SQLException {
        preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }

}
