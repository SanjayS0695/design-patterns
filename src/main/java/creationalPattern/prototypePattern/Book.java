package creationalPattern.prototypePattern;

public class Book extends Item implements Cloneable{

    private int numberOfPages;

    private Author author;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    public Book deepClone() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        book.setAuthor(this.author.clone());
        return book;
    }

}
