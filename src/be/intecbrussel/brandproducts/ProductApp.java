package be.intecbrussel.brandproducts;

import be.intecbrussel.brandproducts.model.AfterShave;
import be.intecbrussel.brandproducts.model.Deodorant;
import be.intecbrussel.brandproducts.model.Parfum;
import be.intecbrussel.brandproducts.persistence.Order;

public class ProductApp {

    public static void main(String[] args) {
        Order order = new Order();
        order.addProduct(new Parfum("Bambino", "Jul", 250, 150));
        order.addProduct(new Deodorant("Gigi l'amoroso", "SCH", 50, 50, Deodorant.Type.STICK));
        order.addProduct(new AfterShave("Tonton du bled", "Nekfeu", 500, 80, AfterShave.Type.GEL));
        order.addProduct(new Parfum("Le Sapologue", "Booba", 300, 200));
        order.addProduct(new Parfum("Personne", "Alpha Wann", 100, 120));
        order.sortByBrand();
        order.printOrder();
        System.out.println("");
        order.printParfumes();
        System.out.println("");
        order.printByBrand("Bambino");
        System.out.println("");
        System.out.println(order.getMostExpensive().toString());
    }
}
