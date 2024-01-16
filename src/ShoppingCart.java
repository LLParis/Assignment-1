// London Paris
//
//

import java.util.*;

public class ShoppingCart {
    private ArrayList<ItemOrder> items;
    private boolean discount;
    public static final double DISCOUNT_PERCENT = 0.9;

    public ShoppingCart() {
        items = new ArrayList<>();
        discount = false;
    }

    public void add(ItemOrder next) {
        items.add(next);
    }

    public void setDiscount(boolean discount) {
            this.discount = discount;
    }

    public double getTotal() {
        double total = 0;
        for (ItemOrder order : items) {
            total += order.getPrice();
        }
        if (discount) {
            total *= 0.9;
        }
        return total;
    }
}
