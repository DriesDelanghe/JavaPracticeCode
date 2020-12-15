package Oefeningen.Magazijn;

import java.util.ArrayList;

public class Magazijn {

    private String Postcode;
    private ArrayList<Product> productLijst = new ArrayList<Product>();

    public Magazijn(String postcode) {
        Postcode = postcode;
    }

    public void VoegToe(Product product) {
        productLijst.add(product);
    }

    @Override
    public String toString() {
        String m = "magazijn op " + this.Postcode + " bevat volgende producten:" + "\n";

        for (Product p : productLijst) {
            m = m + p + "\n";
        }
        return m;
    }

    public void verhoogPrijs(double percentage) {

        for (Product p : productLijst) {
            p.verhoogPrijs(percentage);
        }
    }

    public void toonLijstAanTeVullen() {

        String s = "Volgende producten moeten aangevuld worden:" + "\n";
        for (Product p : productLijst) {
            if (p.getAantalInVoorraad() < 5) {
                s += p.getOmschrijving() + "\n";
            }
        }

        System.out.println(s);
    }

}
