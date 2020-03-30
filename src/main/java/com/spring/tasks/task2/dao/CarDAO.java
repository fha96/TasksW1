package com.spring.tasks.task2.dao;

import com.spring.tasks.task2.entity.Car;

import java.sql.SQLException;

public interface CarDAO {

    void saveCar(Car car) throws SQLException;

    Car findCarByID(String id) throws SQLException;

    Car findCarByItsType(String typeOfCar) throws SQLException;

    Car findCarByItsColor(String carColor);

    Car findCarByItsOwner(String owner);

    void findTotalTrafficViolationAmountByOwner();

    void updateCar(Car car);

    void deleteCarById(String id);

    void deleteCarByOwner(String owner);

    void deleteCarByType(String type);

}
