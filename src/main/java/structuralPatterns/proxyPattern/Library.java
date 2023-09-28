package structuralPatterns.proxyPattern;

import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFilename(), ebook);
    }

    public void openBook(String filename) {
        ebooks.get(filename).showBook();
    }
}
