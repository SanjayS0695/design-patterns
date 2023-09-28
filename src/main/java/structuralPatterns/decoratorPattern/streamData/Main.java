package structuralPatterns.decoratorPattern.streamData;

public class Main {
    public static void main(String[] args) {
        var stream = new CloudStream();
        stream.writeData("Hello world");
        //Hello world

        var stream1 = new CompressedStream(new CloudStream());
        stream1.writeData("Hello World");
        //Compressed Hello World

        var stream2 = new EncryptedStream(new CompressedStream(new CloudStream()));
        stream2.writeData("Hello World");
        //Compressed Encrypted Hello World
    }
}
