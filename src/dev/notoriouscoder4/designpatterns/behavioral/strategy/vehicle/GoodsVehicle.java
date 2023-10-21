package dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle;

import dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
