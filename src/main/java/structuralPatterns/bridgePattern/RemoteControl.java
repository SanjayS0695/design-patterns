package structuralPatterns.bridgePattern;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        this.device.turnOn();
    }

    public void turnOff() {
        this.device.turnOff();
    }
}
