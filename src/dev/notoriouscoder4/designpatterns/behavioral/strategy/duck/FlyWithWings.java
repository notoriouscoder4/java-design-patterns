package dev.notoriouscoder4.designpatterns.behavioral.strategy.duck;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
