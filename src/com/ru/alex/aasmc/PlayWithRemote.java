package com.ru.alex.aasmc;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args) {

        ElectronicDevice newDevice = TVRemote.getDevice();

        final TurnTVOn onCommand = new TurnTVOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        //-------------------------------

        final TurnTVOff offCommand = new TurnTVOff(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();

        //-------------------------------

        final TurnVolumeUp upCommand = new TurnVolumeUp(newDevice);
        onPressed = new DeviceButton(upCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //-------------------------------
        final Television television = new Television();
        final Radio radio = new Radio();
        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(television);
        devices.add(radio);
        final TurnItAllOff turnItAllOff = new TurnItAllOff(devices);
        DeviceButton turnThemOff = new DeviceButton(turnItAllOff);
        turnThemOff.press();
        //--------------------------

        turnThemOff.pressUndo();
    }
}
