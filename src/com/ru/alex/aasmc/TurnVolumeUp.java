package com.ru.alex.aasmc;

public class TurnVolumeUp implements Command{

    ElectronicDevice theDevice;

    public TurnVolumeUp(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
