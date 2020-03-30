package com.spring.tasks.task2.database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionPool {

    private JeaQueue<ConnectionWrapper> connections;

    public DataBaseConnectionPool() {
        this.connections = new JeaQueue<>(10);

    }

    public ConnectionWrapper getConnection() throws SQLException {
        if (this.connections.isEmpty()) {
            System.out.println("There is No Connection ");
            ConnectionWrapper connectionWrapper = new ConnectionWrapper(DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", "root@JEA"));
            return connectionWrapper;
        } else {
            ConnectionWrapper connectionWrapper = this.connections.deQueue();
            if (connectionWrapper.isAlive()) {
                System.out.println("Connection is Alive ");
                return connectionWrapper;

            } else {
                System.out.println("Connection is Not Alive ");
                connectionWrapper.getConnection().close();
                return getConnection();
            }
        }
    }

    public void releaseConnection(ConnectionWrapper connectionWrapper) {
        this.connections.enQueue(connectionWrapper);
    }

}
