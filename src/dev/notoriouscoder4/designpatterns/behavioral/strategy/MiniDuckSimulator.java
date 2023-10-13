package dev.notoriouscoder4.designpatterns.behavioral.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        System.out.println("Mallard Duck");
        mallard.performFly();
        mallard.performQuack();
        System.out.println("Mallard Duck");
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performFly();
        mallard.performQuack();
        System.out.println("Mallard Duck");
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());
        mallard.performFly();
        mallard.performQuack();
        System.out.println("Mallard Duck");
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.setQuackBehavior(new Squeak());
        mallard.performFly();
        mallard.performQuack();
        System.out.println("Mallard Duck");
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());
        mallard.performFly();
        mallard.performQuack();


        System.out.println("Model Duck");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
