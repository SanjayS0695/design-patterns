package structuralPatterns.bridgePattern;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("SonyTV turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("SonyTV turned Off");
    }

    @Override
    public void setChannel(int i) {
        System.out.println("SonyTV: setChannel - " + i);
    }

    @Override
    public void connectToNetflix() {
        System.out.println("SonyTV connected to Netflix");
    }
}
