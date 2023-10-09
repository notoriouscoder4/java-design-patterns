package dev.notoriouscoder4.designpatterns.creational.singleton.doublecheckedlockingSingleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}

/*
 * Output: I'm a double-checked lock thread safe Singleton!
 * */