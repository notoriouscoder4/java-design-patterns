package dev.notoriouscoder4.designpatterns.creational.singleton.doublecheckedlockingSingleton;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//
public class Singleton {
    private static volatile Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a double-checked lock thread safe Singleton!";
    }
}
