package structuralPatterns.proxyPattern;

public class proxyPattern {

    public static void main(String[] args) {
        var library = new Library();

        String[] fileNames = {"a", "b", "c", "d"};

        for(String str: fileNames) {
            library.add(new RealEbook(str));
        }

        library.openBook("a");
        //Loaded book a
        //Loaded book b
        //Loaded book c
        //Loaded book d
        //Showing book a

        //All loaded above

        var library1 = new Library();

        String[] fileNames1 = {"a", "b", "c", "d"};

        for(String str: fileNames1) {
            library1.add(new ProxyEbook(str));
        }

        library1.openBook("a");
        //Loaded book a
        //Showing book a
        library1.openBook("c");
        //Loaded book c
        //Showing book c

        //example of lazy initalization or loading on demand
    }
}
