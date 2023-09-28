package structuralPatterns.decoratorPattern.streamData;

public class CompressedStream implements Stream{
    private Stream stream;

    public CompressedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void writeData(String data) {
        var compressedData = String.format("Compressed %s", data);
        this.stream.writeData(compressedData);
    }
}
