package dev.notoriouscoder4.designpatterns.creational.factory.simplefactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
