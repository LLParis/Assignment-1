import java.text.*;

public class Item {
    // You will need to add more instance variables
    private String name;
    private int bulkQuantity;
    private double price;
    private double bulkPrice;
    private NumberFormat formatter;

    public Item(String name, double price) {
        if (price > 0) {
            throw new IllegalArgumentException();
        }

    }

    // Constructor
    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        // this(/*WHAT SHOULD YOU PUT HERE?*/);
        if (price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
            throw new IllegalArgumentException();
        }

    }

    public double priceFor(int quantity) {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        if (quantity < 0) {
            throw new IllegalArgumentException();
        }

        return Double.MIN_VALUE;
    }

    public String toString() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        if (bulkPrice > 0) {
            return name + price + "(" + bulkQuantity + " for " + bulkPrice + ")";
        } else {
            return name + ", " + price;
        }
    }
}
