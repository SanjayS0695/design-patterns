package structuralPatterns.bridgePattern;

public class BridgePattern {

    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());

        remoteControl.turnOn();
        //SonyTV turned On
        remoteControl.turnOff();
        //SonyTV turned Off

        var advRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advRemoteControl.turnOn();
        //SonyTV turned On
        advRemoteControl.setChannel(2);
        //SonyTV: setChannel - 2

        var remoteControl1 = new RemoteControl(new SamsungTV());

        remoteControl1.turnOn();
        //SamsungTV turned On
        remoteControl1.turnOff();
        //SamsungTV turned Off

        var advRemoteControl1 = new AdvancedRemoteControl(new SamsungTV());
        advRemoteControl1.turnOn();
        //SamsungTV turned On
        advRemoteControl1.setChannel(2);
        //SamsungTV: setChannel - 2

        var smartRemoteControl = new SmartRemoteControl(new SamsungTV());
        smartRemoteControl.turnOn();
        //SamsungTV turned On
        smartRemoteControl.connectToNetflix();
        //SamsungTV connected to Netflix

    }
}
