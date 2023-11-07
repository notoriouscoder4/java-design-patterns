package dev.notoriouscoder4.designpatterns.behavioral.command;

public class HotTubOnCommand implements Command {
    HotTub hotTub;

    public HotTubOnCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.on();
    }

    @Override
    public void undo() {
        hotTub.off();
    }
}
