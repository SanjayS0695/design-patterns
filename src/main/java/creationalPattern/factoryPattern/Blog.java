package creationalPattern.factoryPattern;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new HomePage());
        pages.add(new ContactPage());
    }
}
