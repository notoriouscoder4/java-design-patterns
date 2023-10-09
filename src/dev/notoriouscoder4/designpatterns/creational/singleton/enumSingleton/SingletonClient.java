package dev.notoriouscoder4.designpatterns.creational.singleton.enumSingleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println(singleton.getDescription());
    }
}

/* Output-
 * I'm a thread safe Singleton!
 * */
