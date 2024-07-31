package com;

public class CommandPatternTest {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        // Turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();
        System.out.println();

        // Turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
