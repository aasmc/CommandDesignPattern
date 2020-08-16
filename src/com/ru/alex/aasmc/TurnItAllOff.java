package com.ru.alex.aasmc;

import java.util.List;

public class TurnItAllOff implements Command{

    List<ElectronicDevice> devices;

    public TurnItAllOff(List<ElectronicDevice> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.forEach(ElectronicDevice::off);
    }

    @Override
    public void undo() {
        devices.forEach(ElectronicDevice::on);
    }
}
