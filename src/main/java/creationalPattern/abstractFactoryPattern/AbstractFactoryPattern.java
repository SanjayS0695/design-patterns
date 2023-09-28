package creationalPattern.abstractFactoryPattern;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        var creditCardFactoryOne = CreditCardFactory.getCreditCardFactory(800);
        var creditCardOne = creditCardFactoryOne.getCreditCard(CardType.GOLD);

        System.out.println(creditCardOne);
        //creationalPattern.abstractFactoryPattern.VisaGoldCard@18b4aac2

        var creditCardFactoryTwo = CreditCardFactory.getCreditCardFactory(500);
        var creditCardTwo = creditCardFactoryTwo.getCreditCard(CardType.PLATINUM);

        System.out.println(creditCardTwo);
        //creationalPattern.abstractFactoryPattern.MasterPlatinumCard@73d16e93
    }
}
