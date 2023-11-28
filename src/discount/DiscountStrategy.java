package discount;

public class DiscountStrategy implements DiscountType{
    private double discountAmount;

    public DiscountStrategy(double discountAmount)
    {
        this.discountAmount = discountAmount;
    }

    @Override
    public double getBillAmount(double subtotal) {
        return subtotal - (subtotal * discountAmount);
    }
}
