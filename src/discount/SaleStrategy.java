package discount;

public class SaleStrategy implements DiscountType{
    private double discountAmount;

    public SaleStrategy(double discountAmount)
    {
        this.discountAmount = discountAmount;
    }

    @Override
    public double getBillAmount(double subtotal) {
        return subtotal - (subtotal * discountAmount);
    }
}
