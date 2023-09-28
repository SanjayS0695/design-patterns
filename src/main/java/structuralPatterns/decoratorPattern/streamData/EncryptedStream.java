package structuralPatterns.decoratorPattern.streamData;

public class EncryptedStream implements Stream{
    private Stream stream;

    public EncryptedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void writeData(String data) {
        var encryptedData = String.format("Encrypted %s", data);
        this.stream.writeData(encryptedData);
    }
}
