package com.spring.tasks.task2.dao;

import com.spring.tasks.task2.database.DataBaseConnectionPool;
import com.spring.tasks.task2.entity.Car;
import com.spring.tasks.task2.maindb.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDAOImpl implements CarDAO {

    @Autowired
    private DBConnection dbConnection;

    public void saveCar(Car car) throws SQLException {
        String saveQuery = "insert into cars(Id, Type, Version, Model, Owner, Color, Number of seats, License expiry, TrafficViolationTotalAmount) " +
                "values(?,?,?,?,?,?,?,?,?);";

        dbConnection.saveCar(saveQuery, car);

    }

    public Car findCarByID(String id) throws SQLException {
        Car car = null;
        String findById = "select *from cars" + "where id=" + id;
        ResultSet rs = dbConnection.findCar(findById);
        while (rs.next()) {
            car = new Car();
            car.setId(rs.getString(1));
            car.setType(rs.getString(2));
            car.setVersion(rs.getString(3));
            car.setModel(rs.getString(4));
            car.setOwner(rs.getString(5));
            car.setColor(rs.getString(6));
            car.setNumberOfSeats(rs.getString(7));
            car.setLicenseExpiry(rs.getString(8));
            car.setTrafficViolationTotalAmount(rs.getString(9));
        }
        return car;
    }

    public Car findCarByItsType(String typeOfCar) throws SQLException {
        Car car = null;
        String findByType = "select *from cars" + "where type=" + typeOfCar;
        ResultSet rs = dbConnection.findCar(findByType);
        while (rs.next()) {
            car = new Car();
            car.setId(rs.getString(1));
            car.setType(rs.getString(2));
            car.setVersion(rs.getString(3));
            car.setModel(rs.getString(4));
            car.setOwner(rs.getString(5));
            car.setColor(rs.getString(6));
            car.setNumberOfSeats(rs.getString(7));
            car.setLicenseExpiry(rs.getString(8));
            car.setTrafficViolationTotalAmount(rs.getString(9));
        }
        return car;
    }

    public Car findCarByItsColor(String carColor) {
        return null;
    }

    public Car findCarByItsOwner(String owner) {
        return null;
    }

    public void findTotalTrafficViolationAmountByOwner() {

    }

    public void updateCar(Car car) {

    }

    public void deleteCarById(String id) {

    }

    public void deleteCarByOwner(String owner) {

    }

    public void deleteCarByType(String type) {

    }
}
