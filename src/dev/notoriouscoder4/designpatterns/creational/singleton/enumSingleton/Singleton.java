package dev.notoriouscoder4.designpatterns.creational.singleton.enumSingleton;

/*
* Pros:
* It is simple to write Enum Singletons
* Enums are inherently serializable
* No problems of reflection occur
* It is thread-safe to create enum instances

* Cons:
* By default, enums do not support lazy loading
* Enums won’t allow changing a singleton object to multiton
* */
public enum Singleton {
    UNIQUE_INSTANCE;
    // other useful fields here

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
