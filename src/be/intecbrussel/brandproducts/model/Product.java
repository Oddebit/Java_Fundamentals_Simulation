package be.intecbrussel.brandproducts.model;

import be.intecbrussel.brandproducts.persistence.Order;

public abstract class Product implements Comparable<Product> {

    protected int productNumber;
    protected String brand;
    protected String name;
    protected int volume;
    protected double price;

    public Product(String brand,
                   String name,
                   int volume,
                   double price) {
        this.productNumber = Order.getProductNumber();
        this.brand = brand;
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode() {
        StringBuilder productCode = new StringBuilder();

        productCode.append(brand.substring(0, 3).toUpperCase().replace(' ', '_'));
        productCode.append(name.substring(0, 3).toUpperCase().replace(' ', '_'));
        productCode.append(volume);

        return productCode.toString();
    }

    @Override
    public int compareTo(Product o) {
        return brand.compareTo(o.getBrand());
    }

    @Override
    public String toString() {
        return String.format("%5d  Brand: %-25s  Name: %-25s Volume: %4dml  Price: %6.2f€  Code: %-10s",
                              productNumber, brand,  name,        volume,       price,       getProductCode());
    }
}
