package dev.notoriouscoder4.designpatterns.behavioral.command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on(); // undo the off command by turning the light back on
    }
}
