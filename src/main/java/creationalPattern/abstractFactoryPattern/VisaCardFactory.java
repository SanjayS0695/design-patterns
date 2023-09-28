package creationalPattern.abstractFactoryPattern;

public class VisaCardFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCard();
            case PLATINUM:
                return new VisaPlatinumCard();
            default:
                throw new IllegalStateException("Card type not found");
        }
    }

    @Override
    public Validator getCreditCardValidator(CardType cardType) {
        return new VisaValidator();
    }
}
