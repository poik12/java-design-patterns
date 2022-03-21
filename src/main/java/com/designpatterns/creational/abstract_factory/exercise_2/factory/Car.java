package com.designpatterns.creational.abstract_factory.exercise_2.factory;

public abstract class Car {

    private int engineCapacity;
    private String fuelType;
    private String productionYear;
    private String steeringWheelPosition;

    public Car(int engineCapacity, String fuelType, String productionYear, String steeringWheelPosition) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public void setSteeringWheelPosition(String steeringWheelPosition) {
        this.steeringWheelPosition = steeringWheelPosition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", steeringWheelPosition='" + steeringWheelPosition + '\'' +
                '}';
    }
}
