package dev.notoriouscoder4.designpatterns.behavioral.command;

public class GarageDoor {
    String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " garage Door is Open");
    }

    public void down() {
        System.out.println(location + " garage Door is Closed");
    }

}
