package dev.notoriouscoder4.designpatterns.behavioral.strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
