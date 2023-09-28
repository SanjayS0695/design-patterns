package creationalPattern.prototypePattern;

public abstract class Item implements Cloneable{

    private String title;
    private Double rent;
    private String url;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
