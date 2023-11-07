package dev.notoriouscoder4.designpatterns.behavioral.command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off(); // undo the on command by turning the light back off
    }
}
