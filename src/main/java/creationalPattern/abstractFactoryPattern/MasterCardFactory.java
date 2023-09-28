package creationalPattern.abstractFactoryPattern;

public class MasterCardFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new MasterGoldCard();
            case PLATINUM:
                return new MasterPlatinumCard();
            default:
                throw new IllegalStateException("Card type not found");
        }
    }

    @Override
    public Validator getCreditCardValidator(CardType cardType) {
        return new MasterCardValidator();
    }
}
