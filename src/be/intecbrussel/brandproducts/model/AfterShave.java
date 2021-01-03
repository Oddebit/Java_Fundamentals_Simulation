package be.intecbrussel.brandproducts.model;

public class AfterShave extends Product{

    private Type type;

    public AfterShave(String brand, String name, int volume, double price, Type type) {
        super(brand, name, volume, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%5d  Brand: %-25s  Name: %-25s Volume: %4dml  Price: %6.2f€  Code: %-10s  %s",
                productNumber, brand,  name,        volume,       price,       getProductCode(),    type);
    }

    public enum Type {
        VAPO,
        GEL
    }
}
