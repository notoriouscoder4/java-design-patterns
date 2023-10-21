package dev.notoriouscoder4.designpatterns.behavioral.strategy.duck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
