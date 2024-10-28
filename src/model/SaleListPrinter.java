package model;

public class SaleListPrinter implements Printable {
    private SaleList saleList;

    public SaleListPrinter(SaleList saleList) {
        this.saleList = saleList;
    }

    @Override
    public void print() {
        for (SaleItem item : saleList.getSaleItems()) {
            Product product = item.getProduct();
            System.out.println("-----------------------------------");
            System.out.printf("Product: %s\n", product.getName());
            System.out.printf("Price: %.2f\n", product.getPrice());
            System.out.printf("Quantity: %d\n", item.getQuantity());
            System.out.printf("Total Price: %.2f\n", item.calculateTotal());
            System.out.println("-----------------------------------");
        }
        System.out.printf("Total Sale Price: %.2f\n", saleList.calculateTotal());
    }
}
