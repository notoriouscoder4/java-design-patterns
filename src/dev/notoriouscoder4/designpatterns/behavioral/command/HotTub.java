package dev.notoriouscoder4.designpatterns.behavioral.command;

public class HotTub {
    boolean on;
    int temperature;

    public HotTub() {
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void bubblesOn() {
        if (on) {
            System.out.println("HotTub is bubbling!");
        }
    }

    public void bubblesOff() {
        if (on) {
            System.out.println("HotTub is not bubbling");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("HotTub jets are on");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("HotTub jets are off");
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public void heat() {
        temperature = 105;
        System.out.println("HotTub is heating to a steaming 105 degrees");
    }

    public void cool() {
        temperature = 98;
        System.out.println("HotTub is cooling to 98 degrees");
    }
}
