package dev.notoriouscoder4.designpatterns.structural.decorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
