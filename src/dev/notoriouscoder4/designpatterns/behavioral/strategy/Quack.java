package dev.notoriouscoder4.designpatterns.behavioral.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
