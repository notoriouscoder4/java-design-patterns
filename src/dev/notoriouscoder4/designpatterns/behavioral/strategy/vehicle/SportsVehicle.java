package dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle;

import dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
