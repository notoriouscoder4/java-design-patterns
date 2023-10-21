package dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving normally");
    }
}
