package creationalPattern.prototypePattern;

public class Author implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author(String name) {
        this.name = name;
    }

    @Override
    public Author clone() {
        try {
            return (Author) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
