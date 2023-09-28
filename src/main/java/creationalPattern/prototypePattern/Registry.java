package creationalPattern.prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        var movie = new Movie();
        movie.setTitle(null);
        movie.setRent(null);
        movie.setRunTime(null);
        movie.setUrl(null);
        movie.setDirector(new Director(""));
        items.put("MOVIES", movie);

        var book = new Book();
        book.setTitle(null);
        book.setRent(null);
        book.setUrl(null);
        book.setNumberOfPages(0);
        book.setAuthor(new Author(""));
        items.put("BOOKS", book);
    }

    public Item createItemWithClone(String type) {
        try {
            return (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Item createItemWithDeepClone(String type) {
        var item = (Item)(items.get(type));
        if (item instanceof Movie) {
            try {
                return ((Movie) item).deepClone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        } else if (item instanceof Book) {
            try {
                return ((Book) item).deepClone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
