package structuralPatterns.bridgePattern;

public class SmartRemoteControl extends RemoteControl{
    public SmartRemoteControl(Device device) {
        super(device);
    }

    public void connectToNetflix() {
        device.connectToNetflix();
    }
}
