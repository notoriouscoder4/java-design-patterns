package dev.notoriouscoder4.designpatterns.behavioral.command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        HotTub hottub = new HotTub();

        LightOnCommand lightOn = new LightOnCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        HotTubOnCommand hotTubOn = new HotTubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HotTubOffCommand hotTubOff = new HotTubOffCommand(hottub);

        Command[] onCommands = {lightOn, tvOn, stereoOn, hotTubOn};
        Command[] offCommands = {lightOff, tvOff, stereoOff, hotTubOff};

        MacroCommand onMacroCommands = new MacroCommand(onCommands);
        MacroCommand offMacroCommands = new MacroCommand(offCommands);

        remoteControl.setCommand(0, onMacroCommands, offMacroCommands);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
