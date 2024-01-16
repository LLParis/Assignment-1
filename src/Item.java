import java.text.*;

public class Item {
    // You will need to add more instance variables
    private String name;
    private int bulkQuantity;
    private double price;
    private double bulkPrice;
    private NumberFormat formatter;

    public Item(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.formatter = NumberFormat.getCurrencyInstance();
        this.name = name;
        this.price = price;

    }

    // Constructor
    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this(name, price);
        if (bulkQuantity < 0 || bulkPrice < 0) {
            throw new IllegalArgumentException("Bulk quantity and bulk price cannot be negative.");
        }
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;

    }

    public double priceFor(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        return quantity * price;
    }

    public String toString() {
        String priceString = formatter.format(price);
        if (bulkPrice > 0) {
            String bulkPriceString = formatter.format(price);
            return name + ", " + priceString + " (" + bulkQuantity + " for " + bulkPriceString + ")";
        } else {
            return name + ", " + priceString;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return name.equals(item.name) && Double.compare(price, item.price) == 0;
    }

}
