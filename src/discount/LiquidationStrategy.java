package discount;

public class LiquidationStrategy implements DiscountType{
    private double discountAmount;

    public LiquidationStrategy(double discountAmount)
    {
        this.discountAmount = discountAmount;
    }

    @Override
    public double getBillAmount(double subtotal) {
        return subtotal - (subtotal * discountAmount);
    }
}
