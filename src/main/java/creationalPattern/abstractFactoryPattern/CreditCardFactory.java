package creationalPattern.abstractFactoryPattern;

//AbstractFactory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 750) {
            return new VisaCardFactory();
        } else {
            return new MasterCardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getCreditCardValidator(CardType cardType);
}
