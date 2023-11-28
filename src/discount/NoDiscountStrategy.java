package discount;

public class NoDiscountStrategy implements DiscountType{

    @Override
    public double getBillAmount(double subtotal) {
        return subtotal;
    }
}
