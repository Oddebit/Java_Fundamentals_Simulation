package be.intecbrussel.brandproducts.persistence;

import be.intecbrussel.brandproducts.model.Parfum;
import be.intecbrussel.brandproducts.model.Product;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> order;
    private static int productNumber = 1000;

    public Order() {
        this.order = new ArrayList<>();
    }

    public void addProduct(Product product) {
        order.add(product);
        productNumber++;
    }

    public void sortByBrand() {
        order.sort(Product::compareTo);
    }

    public void printOrder() {
        for (Product product : order) {
            System.out.println(product.toString());
        }
    }

    public void printByBrand(String brand) {
        for (Product product : order) {
            if (product.getBrand().equals(brand)) {
                System.out.println(product.toString());
            }
        }
    }

    public void printParfumes() {
        Parfum tempParfum = new Parfum("", "", 1, 1);
        for (Product product : order) {
            if (product.getClass().equals(tempParfum.getClass())) {
                System.out.println(product.toString());
            }
        }
    }

    public Product getMostExpensive() {
        if(order.isEmpty()) return null;

        Product tempProduct = order.get(0);
        for (Product product : order) {
            if (tempProduct.getPrice() < product.getPrice()) tempProduct = product;
        }
        return tempProduct;
    }

    public static int getProductNumber() {
        return productNumber;
    }
}
