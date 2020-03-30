package com.spring.tasks.task2.entity;

public class Car {
    String id;
    String type;
    String version;
    String model;
    String owner;
    String color;
    String numberOfSeats;
    String licenseExpiry;
    String trafficViolationTotalAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getLicenseExpiry() {
        return licenseExpiry;
    }

    public void setLicenseExpiry(String licenseExpiry) {
        this.licenseExpiry = licenseExpiry;
    }

    public String getTrafficViolationTotalAmount() {
        return trafficViolationTotalAmount;
    }

    public void setTrafficViolationTotalAmount(String trafficViolationTotalAmount) {
        this.trafficViolationTotalAmount = trafficViolationTotalAmount;
    }
}
