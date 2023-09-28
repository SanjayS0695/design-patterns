package structuralPatterns.decoratorPattern.streamData;

public class CloudStream implements Stream {
    @Override
    public void writeData(String data) {
        System.out.println(data);
    }
}
