package creationalPattern.prototypePattern;

public class Director implements Cloneable{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director(String name) {
        this.name = name;
    }

    @Override
    public Director clone() {
        try {
            return (Director) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
