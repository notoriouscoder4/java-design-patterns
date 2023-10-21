package dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving like a sports car");
    }
}
