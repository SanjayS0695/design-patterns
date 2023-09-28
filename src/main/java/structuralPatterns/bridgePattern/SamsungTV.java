package structuralPatterns.bridgePattern;

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("SamsungTV turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("SamsungTV turned On");
    }

    @Override
    public void setChannel(int i) {
        System.out.println("SamsungTV: setChannel - " + i);
    }

    @Override
    public void connectToNetflix() {
        System.out.println("SamsungTV connected to Netflix");
    }
}
