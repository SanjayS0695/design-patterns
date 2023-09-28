package structuralPatterns.bridgePattern;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int i) {
        device.setChannel(i);
    }
}
