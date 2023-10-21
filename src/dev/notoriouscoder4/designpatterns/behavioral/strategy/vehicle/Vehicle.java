package dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle;

import dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle.strategy.DriveStrategy;

public class Vehicle {
    // Below line is indicating tht Vehicle HAS-A DriveStrategy
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
