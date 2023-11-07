package dev.notoriouscoder4.designpatterns.behavioral.command;

public class HotTubOffCommand implements Command {
    HotTub hotTub;

    public HotTubOffCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.off();
    }

    @Override
    public void undo() {
        hotTub.on();
    }
}
