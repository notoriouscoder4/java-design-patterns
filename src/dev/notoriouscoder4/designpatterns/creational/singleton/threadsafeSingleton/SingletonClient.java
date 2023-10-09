package dev.notoriouscoder4.designpatterns.creational.singleton.threadsafeSingleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}

/*
 * Output: I'm a thread safe Singleton!
 * */