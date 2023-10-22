package dev.notoriouscoder4.designpatterns.creational.factory.simplefactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza();
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza();
            }
            case "clam" -> {
                pizza = new ClamPizza();
            }
            case "veggie" -> {
                pizza = new VeggiePizza();
            }
        }
        return pizza;
    }
}
