package discount;

public class DiscountTypeFactory {
    //completely unneccessary implementation of singleton pattern, just to understand it.
    private static DiscountTypeFactory instance;

    public static DiscountTypeFactory getInstance()
    {
        if(instance == null)
        {
            synchronized (DiscountTypeFactory.class) {
                if(instance == null)
                    instance = new DiscountTypeFactory();
            }
        }
        return instance;
    }

    private DiscountTypeFactory()
    {

    }
    public DiscountType make(char discountType)
    {
        return switch (discountType) {
            //I made strategies for each "type" of discount, but their implementation is identical - the only change
            //is a magic number.  leaving the strategies there for proof of concept, but only using the 2 necessary ones.
            case 'S', 's' -> new DiscountStrategy(0.1); //new SaleStrategy(0.1);
            case 'D', 'd' -> new DiscountStrategy(0.5);
            case 'L', 'l' -> new DiscountStrategy(0.75);//new LiquidationStrategy(0.75);
            default -> new NoDiscountStrategy();
        };
    }
}
