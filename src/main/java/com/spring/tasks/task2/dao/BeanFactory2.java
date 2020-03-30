package com.spring.tasks.task2.dao;

import com.spring.tasks.task2.maindb.DBConnection;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

public class BeanFactory2 {

    @Bean
    public CarDAO getCar() {
        return new CarDAOImpl();
    }

    @Bean
    public DBConnection getConn() throws SQLException {
        return new DBConnection();
    }
}
