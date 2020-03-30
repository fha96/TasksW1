package com.spring.tasks.task2;


import com.spring.tasks.task2.dao.BeanFactory2;
import com.spring.tasks.task2.dao.CarDAO;
import com.spring.tasks.task2.dao.CarDAOImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanFactory2.class);
        CarDAO dao = applicationContext.getBean(CarDAOImpl.class);
        dao.findCarByID("1");

    }
}
