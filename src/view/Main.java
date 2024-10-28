package view;

import model.Product;
import model.SaleList;
import model.SaleListPrinter;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Product A", 10.0);
        Product product2 = new Product("Product B", 15.0);
        
        SaleList salesList = new SaleList();
        salesList.addItem(product1, 2);
        salesList.addItem(product2, 3);

        SaleListPrinter printer = new SaleListPrinter(salesList);
        printer.print();
    }
}
