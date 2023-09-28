package structuralPatterns.proxyPattern;

public class ProxyEbook implements Ebook{
    private String filename;
    private RealEbook realEbook;

    public ProxyEbook(String filename) {
        this.filename = filename;
    }


    @Override
    public void showBook() {
        if (realEbook == null) {
            realEbook = new RealEbook(filename);
        }
        realEbook.showBook();
    }

    @Override
    public String getFilename() {
        return filename;
    }
}
