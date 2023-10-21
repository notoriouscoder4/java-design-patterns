package dev.notoriouscoder4.designpatterns.behavioral.strategy.duck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
