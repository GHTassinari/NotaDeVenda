package model;

import java.util.ArrayList;
import java.util.List;

public class SaleList {
    private List<SaleItem> saleItems;

    public SaleList() {
        this.saleItems = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        SaleItem saleItem = new SaleItem(product, quantity);
        saleItems.add(saleItem);
    }

    public Double calculateTotal() {
        Double total = 0.0;
        for (SaleItem item : saleItems) {
            total += item.calculateTotal();
        }
        return total;
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }
}
