package dev.notoriouscoder4.designpatterns.creational.singleton.threadsafeSingleton;

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here
    private Singleton() {

    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
