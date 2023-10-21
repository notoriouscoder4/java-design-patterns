package dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle;

import dev.notoriouscoder4.designpatterns.behavioral.strategy.vehicle.strategy.SportsDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();
    }
}
