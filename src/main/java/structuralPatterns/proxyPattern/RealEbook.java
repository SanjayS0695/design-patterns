package structuralPatterns.proxyPattern;

public class RealEbook implements Ebook{

    private String filename;

    public RealEbook(String filename) {
        this.filename = filename;
        loadBook();
    }

    private void loadBook() {
        System.out.println("Loaded book " + filename);
    }
    @Override
    public void showBook() {
        System.out.println("Showing book " + filename);
    }

    @Override
    public String getFilename() {
        return this.filename;
    }
}
