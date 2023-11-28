package discount;

public class CustomerOrder {

    private String customerName;
    private double subtotal;
    private DiscountType discountType;

    public CustomerOrder(String customerName, double subtotal, char discountType) {
        this.customerName = customerName;
        this.subtotal = subtotal;
        setDiscountType(discountType);
    }

    public double getBillAmount() {
        return discountType.getBillAmount(subtotal);
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDiscountType(char discountType)
    {
        this.discountType = new DiscountTypeFactory().make(discountType);
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + getBillAmount()
                + ", discountType=" + discountType
                + '}';
    }
}
