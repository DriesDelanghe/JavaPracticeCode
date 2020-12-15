package oefeningenbundel1;

public class TestProduct {
    public static void main(String[] args) {
        Product p = new Product("Nutella",3.5);
        p.verhoogEen();
        System.out.println(p);
        p.verhoogBedrag(0.5);
        System.out.println(p);
    }
}
