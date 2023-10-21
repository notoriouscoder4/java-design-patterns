package dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle;

import dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
