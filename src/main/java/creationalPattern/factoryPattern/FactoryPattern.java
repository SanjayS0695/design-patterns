package creationalPattern.factoryPattern;

public class FactoryPattern {

    public static void main(String[] args) {
        var blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(blog.getPages());
        //[creationalPattern.factoryPattern.AboutPage@4e0e2f2a, creationalPattern.factoryPattern.HomePage@73d16e93, creationalPattern.factoryPattern.ContactPage@659e0bfd]

        var shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(shop.getPages());
        //[creationalPattern.factoryPattern.CartPage@4e25154f, creationalPattern.factoryPattern.SearchPage@70dea4e, creationalPattern.factoryPattern.PaymentPage@5c647e05]
    }
}
