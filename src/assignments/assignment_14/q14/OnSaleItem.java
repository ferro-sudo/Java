package assignments.assignment_14.q14;

public class OnSaleItem extends Item {

    private double discount;
    public String name;
    public double price;

    public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
        super(name, quantity, catalogNumber, price - discount);
        this.discount = discount;

    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;

    }


    @Override
    public java.lang.String toString() {
        return "OnSaleItem{" +
                "discount=" + discount +
                "%, name=" + name +
                ", price=" + price +
                '}';
    }
}
